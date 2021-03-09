package com.example.setsolver

import com.example.setsolver.detection.BoardDetection
import org.junit.Assert
import org.junit.Test
// import org.opencv.android.OpenCVLoader
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgcodecs.Imgcodecs
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.opencv.imgproc.Imgproc


@RunWith(value = Parameterized::class)
class BoardDetectionTest(
        private val filePath: String,
        private val size: Int) {

    init {
        // OpenCVLoader.initDebug();
        nu.pattern.OpenCV.loadShared()
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    @Test
    fun testNumberOfCardsFound() {
        val matrix: Mat = Imgcodecs.imread(filePath)
        val board = BoardDetection(matrix)
        val cards = board.extractCardsFromBoard()
        val cardPath = "src/test/java/com/example/setsolver/cards/"
        cards.forEachIndexed{i, card ->
            Imgcodecs.imwrite( cardPath +filePath.substringAfterLast("/").substringBeforeLast(".") + "_" + i.toString() + ".jpg", card)
        }
        Assert.assertEquals(size, cards.size)}

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name="{index} : BoardRecognition({0}) expected {1}")
        fun data(): Iterable<Array<Any>>{
            return BoardTestData().allBoards.map { (file, value) ->
                val file_path = "src/test/java/com/example/setsolver/board_input/" + file
                val sizeOfBoard = value.size
                arrayOf(file_path, sizeOfBoard)
            }.toList()
        }
    }
}
