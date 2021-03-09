package com.example.setsolver.detection

import android.util.Log
import com.example.setsolver.game.*
import org.opencv.core.*
import org.opencv.imgproc.Imgproc
import java.util.Collections.max

class CardDetection(val img: Mat, val preprocessedForShade: Mat = Mat(), val preprocessed: Mat = Mat()) {
    init {
        preProcessCard()
    }

    fun getCard(): Card {
        val color = getColor()
        return Card(Fill.EMPTY, Count.ONE, color, Shape.DIAMOND)
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

        val intenseColor = colors.mapValues { (_, range) ->
            val mask = Mat()
            Core.inRange(img, range[0], range[1], mask)
            mask
        }.mapValues { (_, mask) ->
            val masked_mat = Mat()
            Core.bitwise_and(img, img, masked_mat, mask)
            masked_mat
        }.mapValues { (_, masked_mat) ->
            // val TotalNumberOfPixels = img.rows() * img.cols()
            val grey_mat = Mat()
            Imgproc.cvtColor(masked_mat, grey_mat, Imgproc.COLOR_BGR2GRAY)
            val NonZeroPixels = Core.countNonZero(grey_mat)
            NonZeroPixels
        }.maxBy { (_, NonZeroPixels) -> NonZeroPixels }!!.key
        return intenseColor
    }

    fun preProcessCard() {
        val grey = Mat()
        Imgproc.cvtColor(img, grey, Imgproc.COLOR_BGR2GRAY)
        val clache = Imgproc.createCLAHE(2.0, Size(8.0, 8.0))
        clache.apply(grey, preprocessedForShade)
        val rgb_planes = mutableListOf<Mat>()
        Core.split(preprocessedForShade, rgb_planes)
        val resultNormPlanes = rgb_planes.map { plane ->
            val dilated = Mat()
            Imgproc.dilate(plane, dilated, Mat.ones(7, 7, CvType.CV_8UC1))
            val bg_img = Mat()
            Imgproc.medianBlur(dilated, bg_img, 21)
            val diffImg = Mat()
            Core.absdiff(plane, bg_img, diffImg)
            val white = diffImg.clone()
            white.setTo(Scalar(255.0))
            val diffImg_2 = Mat()
            Core.absdiff(white, diffImg, diffImg_2)
            val normImg = Mat()
            Core.normalize(diffImg_2, normImg, 0.0, 255.0, Core.NORM_MINMAX, CvType.CV_8UC1)
            normImg
        }
        val merged = Mat()
        Core.merge(resultNormPlanes, merged)
        val gaussian = Mat()
        Imgproc.GaussianBlur(merged, gaussian, Size(5.0, 5.0), 1.0)
        val kernel = Mat.ones(5, 5, CvType.CV_8UC1)
        Imgproc.morphologyEx(gaussian, preprocessed, Imgproc.MORPH_OPEN, kernel)
    }


}