package com.example.setsolver

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.setsolver.detection.BoardDetection
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.opencv.android.OpenCVLoader
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgcodecs.Imgcodecs


@RunWith(AndroidJUnit4::class)
class BoardDetectionTest2 {
    @Test
    fun tryLoadingASimpleImage(){
        OpenCVLoader.initDebug();
        val file = "src/test/java/com/example/setsolver/board_input/set_board0.jpg"
        val matrix: Mat = Imgcodecs.imread(file)
        val board = BoardDetection(matrix)
        val res = board.extractCardsFromBoard()
        Assert.assertEquals(12, res.size)
    }
}