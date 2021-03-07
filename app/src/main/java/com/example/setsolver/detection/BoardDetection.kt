package com.example.setsolver.detection

import org.opencv.core.*
import org.opencv.imgproc.Imgproc
import java.util.stream.Collectors.toList
import kotlin.math.max
import kotlin.math.pow
import kotlin.math.sqrt

class BoardDetection(val image: Mat, val preProcessedImage: Mat = Mat(), val threshold: Mat = Mat()) {
    init {
        preProcessBoard(image)
    }

    fun adjustGamma(img: Mat, gamma: Double): Mat {
        val invGamma = 1.0 / gamma
        val res = Mat()
        val lut = Mat(256, 1, CvType.CV_8U)
        for (i in 0..256) {
            lut.put(i, 0, (i / 255.0).pow(invGamma) * 255.0)
        }
        Core.LUT(img, lut, res)
        return res
    }

    fun preProcessBoard(img: Mat) {
        val kernel = Mat.ones(5, 5, CvType.CV_8UC1)
        val tmp1 = Mat()
        Imgproc.morphologyEx(img, tmp1, Imgproc.MORPH_OPEN, kernel);
        val tmp2 = Mat()
        Imgproc.cvtColor(tmp1, tmp2, Imgproc.COLOR_BGR2Lab)
        val tmp3 = adjustGamma(tmp2, 0.75)
        val tmp4 = Mat()
        Imgproc.cvtColor(tmp3, tmp4, Imgproc.COLOR_BGR2GRAY)
        Imgproc.medianBlur(tmp4, preProcessedImage, 5)
        Imgproc.threshold(preProcessedImage, threshold, 0.0, 255.0, Imgproc.THRESH_OTSU + Imgproc.THRESH_TOZERO)
    }

    fun extractCardsFromBoard(): List<Mat> {
        val rawContours = mutableListOf<MatOfPoint>()
        val hierarchy = Mat()
        Imgproc.findContours(threshold, rawContours, hierarchy, Imgproc.RETR_EXTERNAL, Imgproc.CHAIN_APPROX_SIMPLE)

        val max_area = preProcessedImage.size().area() * 0.9
        val min_area = preProcessedImage.size().area() * 0.005
        val contours = rawContours.filter { x ->
            max_area > Imgproc.contourArea(x) && Imgproc.contourArea(x) > min_area
        }.map { x ->
            val contour = MatOfPoint2f(*x.toArray())
            val epsilon = Imgproc.arcLength(contour, true) * 0.1
            val approx = MatOfPoint2f()
            Imgproc.approxPolyDP(contour, approx, epsilon, true)
            approx
        }.filter { cnt ->
            cnt.toList().size == 4
        }
        val contoursToPlot = contours.map{ c -> MatOfPoint(*c.toArray()) }
        Imgproc.drawContours(image, contoursToPlot, -1, Scalar(0.0, 0.0, 255.0))

        val cards = contours.map { cnt ->
            fourPointTransform(cnt)
        }.map { card ->
            val dst = Mat()
            if (card.size().width > card.size().height) {
                Imgproc.resize(card, dst, Size(400.0, 600.0))
            } else {
                Imgproc.resize(card, dst, Size(600.0, 400.0))
            }
            dst
        }

        return cards
    }

    data class Contour(val tl: Point, val tr: Point, val br: Point, val bl: Point)

    fun orderPointsS(pts: MatOfPoint2f): Contour {
        val points = pts.toList().sortedWith(compareBy { it.x + it.y })
        val tl = points[0]
        val br = points[3]
        val points2 = points.sortedWith(compareBy { it.y - it.x })
        val tr = points2[0]
        val bl = points2[3]
        return Contour(tl, tr, br, bl)
    }

    fun fourPointTransform(pts: MatOfPoint2f): Mat {
        val (tl, tr, br, bl) = orderPointsS(pts)
        val widthA = sqrt(((br.x - bl.x) * (br.x - bl.x)) + ((br.y - bl.y) * (br.y - bl.y)))
        val widthB = sqrt(((tr.x - tl.x) * (tr.x - tl.x)) + ((tr.y - tl.y) * (tr.y - tl.y)))
        val maxWidth = max(widthA, widthB)

        val heightA = sqrt(((tr.x - br.x) * (tr.x - br.x)) + ((tr.y - br.y) * (tr.y - br.y)))
        val heightB = sqrt(((tl.x - bl.x) * (tl.x - bl.x)) + ((tl.y - bl.y) * (tl.y - bl.y)))
        val maxHeight = max(heightA, heightB)

        val src = MatOfPoint2f()
        src.fromList(listOf(tl, tr, br, bl))

        val dst = MatOfPoint2f()
        dst.fromList(listOf(
                Point(0.0, 0.0),
                Point(maxWidth - 1, 0.0),
                Point(maxWidth - 1, maxHeight - 1),
                Point(0.0, maxHeight - 1)
        ))
        val M = Imgproc.getPerspectiveTransform(src, dst)
        val res = Mat()
        Imgproc.warpPerspective(image, res, M, Size(maxWidth, maxHeight))
        return res
    }
}