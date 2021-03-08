package com.example.setsolver.detection

import android.util.Log
import com.example.setsolver.game.Color
import org.opencv.core.Mat
import org.opencv.core.Core
import org.opencv.core.Scalar
import org.opencv.imgproc.Imgproc
import java.util.Collections.max

class CardDetection(val img: Mat) {
    fun getColor(): Color
    {
        val colors = mapOf(
        Color.GREEN to listOf(
                Scalar(0.0,60.0,0.0), Scalar(90.0, 200.0, 90.0)
        ),
        Color.PURPLE to listOf(
                Scalar(35.0,0.0,35.0), Scalar(200.0,90.0,150.0)
        ),
        Color.RED to listOf(
                Scalar(58.0, 37.0, 120.0), Scalar(100.0, 100.0, 230.0))
        )

        val intenseColor = colors.mapValues{ (color, range) ->
            val mask = Mat()
            Core.inRange(img, range[0], range[1], mask)
            Log.i("CardDetection", "For color=$color mask=$mask")
            mask
        }.mapValues{ (color, mask) ->
            val masked_mat = Mat()
            Core.bitwise_and(img, img, masked_mat, mask)
            Log.i("CardDetection", "For color=$color masked_mat=$masked_mat")
            masked_mat
        }.mapValues{ (color, masked_mat) ->
            // val TotalNumberOfPixels = img.rows() * img.cols()
            val grey_mat= Mat()
            Imgproc.cvtColor(masked_mat, grey_mat, Imgproc.COLOR_BGR2GRAY)
            val NonZeroPixels = Core.countNonZero(grey_mat)
            Log.i("CardDetection", "For color=$color grey_mat=$grey_mat")
            Log.i("CardDetection", "For color=$color NonZeroPixels=$NonZeroPixels")
            NonZeroPixels
        }.maxBy{(_, NonZeroPixels) -> NonZeroPixels}!!.key
    return intenseColor
    }
}