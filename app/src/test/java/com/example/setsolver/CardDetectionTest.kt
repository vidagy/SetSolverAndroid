package com.example.setsolver

import org.junit.Test
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgcodecs.Imgcodecs


class CardDetectionTest {
    @Test
    fun tryLoadingASimpleImage(){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME)
        val imageCodecs = Imgcodecs()
        val file = "src/test/java/com/example/setsolver/board_input/set_board0.jpg"
        val matrix: Mat = Imgcodecs.imread(file)
        println("He?")
    }
}