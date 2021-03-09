package com.example.setsolver

import com.example.setsolver.detection.CardDetection
import com.example.setsolver.game.Card
import com.example.setsolver.game.Color
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.opencv.core.Core
import org.opencv.imgcodecs.Imgcodecs
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.io.File


@RunWith(value = Parameterized::class)
class CardDetectionTest(
        private val filepath: String,
        private val expectedCard: Card
) {
    init {
        // OpenCVLoader.initDebug(); //for android
        nu.pattern.OpenCV.loadShared()
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    @Test
    fun testColorCard() {
        val file = File(filepath)
        if (file.exists()){
            val mat = Imgcodecs.imread(filepath)
            val cardDetection = CardDetection(mat)
            val color = cardDetection.getCard().color
            assertEquals(expectedCard.color, color)}
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "{index}: Card Recognition for color({0}) expected ({1})")
        fun data(): Iterable<Array<Any>> {
            val pathPattern = BoardTestData().allBoards.flatMap { (boardName, board) ->
                val myPath = "src/test/java/com/example/setsolver/cards/" +
                        boardName.substringBeforeLast(".") + "_"
                val pairs = board.map{ (num, cardEntry) ->
                    val completePath = myPath + num.toString() + ".jpg"
                    val expectedCard = cardEntry
                    val completePair = arrayOf(completePath, expectedCard)
                    completePair
                }
                pairs
            }
            return pathPattern


//            return TestCardData().allBoards.mapKeys{(boardName, board) ->
//                val fullPath = "src/test/java/com/example/setsolver/cards/" +
//                                boardName.substringBeforeLast(".") + "_"
//                fullPath}.mapValues{ (fullPath, board) ->
//                val completePath = fullPath + board.keys
//                board.fo
//
//            }
        }
    }

}
