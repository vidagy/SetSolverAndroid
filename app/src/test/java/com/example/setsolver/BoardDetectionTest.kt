package com.example.setsolver

import com.example.setsolver.detection.BoardDetection
import org.junit.Assert
import org.junit.Test
// import org.opencv.android.OpenCVLoader
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgcodecs.Imgcodecs


class BoardDetectionTest {
    init {
        // OpenCVLoader.initDebug();
        nu.pattern.OpenCV.loadShared()
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    @Test
    fun tryLoadingASimpleImage() {
        val file = "src/test/java/com/example/setsolver/board_input/set_board1.jpg"
        val matrix: Mat = Imgcodecs.imread(file)
        val board = BoardDetection(matrix)
        val res = board.extractCardsFromBoard()
        Assert.assertEquals(12, res.size)
    }
}