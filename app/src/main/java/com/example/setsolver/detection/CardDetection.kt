package com.example.setsolver.detection

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.setsolver.game.*
import org.opencv.core.*
import org.opencv.imgproc.Imgproc
import kotlin.math.abs
import kotlin.math.log10
import kotlin.math.sqrt

class CardDetection(val img: Mat, val preprocessedForShade: Mat = Mat(), val preprocessed: Mat = Mat(), var shapeContours: Set<MatOfPoint> = setOf()) {
    init {
        preProcessCard()
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun getCard(): Card {
        val color = getColor()
        val count = getNumberOfShapes()
        val shape = getShape()
        val fill = getFill()
        return Card(fill, count, color, shape)
    }

    fun getColor(): Color {
        val colors = mapOf(
                Color.GREEN to listOf(
                        Scalar(0.0, 60.0, 0.0), Scalar(90.0, 200.0, 90.0)
                ),
                Color.PURPLE to listOf(
                        Scalar(35.0, 0.0, 35.0), Scalar(200.0, 90.0, 150.0)
                ),
                Color.RED to listOf(
                        Scalar(58.0, 37.0, 120.0), Scalar(100.0, 100.0, 230.0))
        )

        return colors.mapValues { (_, range) ->
            val mask = Mat()
            Core.inRange(img, range[0], range[1], mask)
            mask
        }.mapValues { (_, mask) ->
            val maskedMat = Mat()
            Core.bitwise_and(img, img, maskedMat, mask)
            maskedMat
        }.mapValues { (_, masked_mat) ->
            // val TotalNumberOfPixels = img.rows() * img.cols()
            val greyMat = Mat()
            Imgproc.cvtColor(masked_mat, greyMat, Imgproc.COLOR_BGR2GRAY)
            val nonZeroPixels = Core.countNonZero(greyMat)
            nonZeroPixels
        }.maxBy { (_, NonZeroPixels) -> NonZeroPixels }!!.key
    }

    fun preProcessCard() {
        val grey = Mat()
        Imgproc.cvtColor(img, grey, Imgproc.COLOR_BGR2GRAY)
        val clache = Imgproc.createCLAHE(2.0, Size(8.0, 8.0))
        clache.apply(grey, preprocessedForShade)
        val rgbPlanes = mutableListOf<Mat>()
        Core.split(preprocessedForShade, rgbPlanes)
        val resultNormPlanes = rgbPlanes.map { plane ->
            val dilated = Mat()
            Imgproc.dilate(plane, dilated, Mat.ones(7, 7, CvType.CV_8UC1))
            val bgImg = Mat()
            Imgproc.medianBlur(dilated, bgImg, 21)
            val diffImg = Mat()
            Core.absdiff(plane, bgImg, diffImg)
            val white = diffImg.clone()
            white.setTo(Scalar(255.0))
            val diffImg2 = Mat()
            Core.absdiff(white, diffImg, diffImg2)
            val normImg = Mat()
            Core.normalize(diffImg2, normImg, 0.0, 255.0, Core.NORM_MINMAX, CvType.CV_8UC1)
            normImg
        }
        val merged = Mat()
        Core.merge(resultNormPlanes, merged)
        val gaussian = Mat()
        Imgproc.GaussianBlur(merged, gaussian, Size(5.0, 5.0), 1.0)
        val kernel = Mat.ones(5, 5, CvType.CV_8UC1)
        Imgproc.morphologyEx(gaussian, preprocessed, Imgproc.MORPH_OPEN, kernel)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun getNumberOfShapes(): Count {
        val minArea = preprocessed.size().area() * 0.06
        val maxArea = preprocessed.size().area() * 0.9

        val threshold = Mat()
        Imgproc.threshold(preprocessed, threshold, 0.0, 255.0, Imgproc.THRESH_OTSU + Imgproc.THRESH_BINARY)
        val rawContours = mutableListOf<MatOfPoint>()
        val hierarchy = Mat()
        Imgproc.findContours(threshold, rawContours, hierarchy, Imgproc.RETR_TREE, Imgproc.CHAIN_APPROX_SIMPLE)
        val coordinates = rawContours.filter { cnt ->
            val area = Imgproc.contourArea(cnt)
            area > minArea && area < maxArea
        }.map { cnt ->
            val moments = Imgproc.moments(cnt)
            val centerOfShapeX = moments.m10 / moments.m00
            val centerOfShapeY = moments.m01 / moments.m00
            cnt to arrayOf(centerOfShapeX, centerOfShapeY)
        }.toMap()

        val goodCoordinates = mutableMapOf<MatOfPoint, Array<Double>>()

        coordinates.forEach { (cnt, xy) ->
            val isInGoodCoordinates = goodCoordinates.values.any { gc ->
                val distance = sqrt(((xy[0] - gc[0]) * (xy[0] - gc[0])) + ((xy[1] - gc[1]) * (xy[1] - gc[1])))
                distance < 50
            }
            if (!isInGoodCoordinates) {
                goodCoordinates[cnt] = xy
            }
        }
        shapeContours = goodCoordinates.keys

        val cardMap = mapOf(1 to Count.ONE, 2 to Count.TWO, 3 to Count.THREE)
        return cardMap.getOrDefault(shapeContours.size, Count.ONE)
    }

    fun getShape(): Shape {
        if (shapeContours.isNotEmpty()) {
            val cont = shapeContours.toList()[0]
            val contour = MatOfPoint2f(*cont.toArray())
            val epsilon = Imgproc.arcLength(contour, true) * 0.01
            val approx = MatOfPoint2f()
            Imgproc.approxPolyDP(contour, approx, epsilon, true)
            val moments = Imgproc.moments(cont)
            val huMoments = Mat()
            Imgproc.HuMoments(moments, huMoments)
            val hu1Log = huMoments[0, 0][0]
            val logged = abs(log10(abs(hu1Log)))
            if (approx.toList().size == 4) {
                return Shape.DIAMOND
            }
            if (logged < 0.62) {
                return Shape.WAVE
            }
            if (logged < 0.669) {
                return Shape.DIAMOND
            }
            return Shape.OVAL
        }
        return Shape.OVAL
    }

    fun getFill(): Fill {
        if (shapeContours.isNotEmpty()) {
            val kernel = Mat(3, 3, CvType.CV_32F)
            kernel.put(0, 0, -1.0)
            kernel.put(0, 1, -1.0)
            kernel.put(0, 2, -1.0)
            kernel.put(1, 0, -1.0)
            kernel.put(1, 1, 9.0)
            kernel.put(1, 2, -1.0)
            kernel.put(2, 0, -1.0)
            kernel.put(2, 1, -1.0)
            kernel.put(2, 2, -1.0)
            val dest = Mat()
            Imgproc.filter2D(img, dest, -1, kernel)
            val shapeColor = shapeContours.map { cnt ->
                val moments = Imgproc.moments(cnt)
                val centerOfShapeX = moments.m10 / moments.m00
                val centerOfShapeY = moments.m01 / moments.m00
                val leftCornerX = centerOfShapeX - 20
                val leftCornerY = centerOfShapeY - 20
                val rightCornerX = centerOfShapeX + 20
                val rightCornerY = centerOfShapeY + 20
                val center = img.submat(leftCornerY.toInt(), rightCornerY.toInt(), leftCornerX.toInt(), rightCornerX.toInt())
                val averaged = Core.mean(center)
                averaged
            }.map { color ->
                arrayOf(color.`val`[0], color.`val`[1], color.`val`[2]).average()
            }.min()!!

            val edgeX = 30
            val edgeY = 30
            val topEdgeX = edgeX - 20
            val topEdgeY = edgeY - 20
            val bottomEdgeX = edgeX + 20
            val bottomEdgeY = edgeY + 20

            val edge = img.submat(topEdgeY, bottomEdgeY, topEdgeX, bottomEdgeX)
            val edgeAvg = Core.mean(edge)
            val minedge = arrayOf(edgeAvg.`val`[0], edgeAvg.`val`[1], edgeAvg.`val`[2]).average()
            val diff = abs(minedge - shapeColor)
            if (diff < 10) {
                return Fill.EMPTY
            }
            if (diff > 70) {
                return Fill.FULL
            }
            return Fill.STRIPED
        }
        return Fill.STRIPED
    }
}