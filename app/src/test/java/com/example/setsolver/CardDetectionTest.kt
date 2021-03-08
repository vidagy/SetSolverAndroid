package com.example.setsolver

import com.example.setsolver.detection.CardDetection
import com.example.setsolver.game.Color
import junit.framework.Assert.assertEquals
import org.junit.Assert
import org.junit.Test
import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.imgcodecs.Imgcodecs
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.nio.file.Files
import java.nio.file.Paths



class CardDetectionTest{
    init {
        // OpenCVLoader.initDebug();
        nu.pattern.OpenCV.loadShared()
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    @Test
    fun testColoronCard(){
        val path = "src/test/java/com/example/setsolver/cards/set_board0_11.jpg"
        val mat = Imgcodecs.imread(path)
        val card = CardDetection(mat)
        val color = card.getColor()
        assertEquals(color, Color.RED)
    }
}
