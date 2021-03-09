package com.example.setsolver

import com.example.setsolver.game.*

class BoardTestData {
    val board0 = mapOf(
            0 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.OVAL),
            2 to Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND),
            3 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            4 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            5 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            6 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            7 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            8 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            9 to Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            10 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            11 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.WAVE)
    )
    val board1 = mapOf(
            0 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            1 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            2 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            3 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            4 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            5 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            6 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            7 to Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            8 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            9 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            10 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            11 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE)
    )
    val board2 = mapOf(
            0 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            1 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            2 to Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            3 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            5 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE),
            6 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.DIAMOND),
            7 to Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND),
            8 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            9 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.OVAL),
            10 to Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.OVAL),
            11 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            12 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
            13 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.DIAMOND),
            14 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND)
    )
    val board3 = mapOf(
            0 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.DIAMOND),
            1 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            2 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            3 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            5 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            6 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            7 to Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            8 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            9 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE),
            10 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            11 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            12 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            13 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            14 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND)
    )
    val board4 = mapOf(
           0 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            1 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            2 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.DIAMOND),
            3 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            5 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            6 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.OVAL),
            7 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            8 to Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            10 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            11 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE)
    )
    val board5 = mapOf(
            0 to Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            1 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.WAVE),
            2 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            3 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            5 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.OVAL),
            6 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE),
            7 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            8 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            10 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            11 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.OVAL)
    )
    val board6 = mapOf(
            0 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            1 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            2 to Card(Fill.FULL, Count.ONE, Color.RED, Shape.WAVE),
            3 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.WAVE),
            4 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            5 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            6 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            7 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            8 to Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.OVAL),
            9 to Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.OVAL),
            10 to Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            11 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            12 to Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            13 to Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND),
            14 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
    )
    val board7 = mapOf(
            0 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE),
            1 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            2 to Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.OVAL),
            3 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.OVAL),
            4 to Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.OVAL),
            5 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.WAVE),
            6 to Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.DIAMOND),
            7 to Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.DIAMOND),
            8 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            9 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            10 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            11 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.WAVE)
    )
    val board8 = mapOf(
            0 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            1 to Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            2 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.DIAMOND),
            3 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            5 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            6 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.OVAL),
            7 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            8 to Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            10 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            11 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE)
    )
    val board9 = mapOf(
            8 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            9 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.OVAL),
            10 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            11 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.OVAL),
            4 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.DIAMOND),
            5 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.WAVE),
            7 to Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            6 to Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.WAVE),
            3 to Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.WAVE),
            2 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            0 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board10 = mapOf(
            5 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            6 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.OVAL),
            7 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            3 to Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            4 to Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.WAVE),
            2 to Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.WAVE),
            1 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            0 to Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            999 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board11 = mapOf(
            11 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            10 to Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.OVAL),
            9 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            8 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            6 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
            7 to Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.WAVE),
            3 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            4 to Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            5 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            0 to Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            2 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.WAVE)
    )
    val board12 = mapOf(
            8 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            10 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.OVAL),
            11 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            9 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            4 to Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            5 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            6 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            7 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            0 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            2 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            3 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board13 = mapOf(
            6 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            8 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.WAVE),
            9 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            7 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            4 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.WAVE),
            3 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            2 to Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            5 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            0 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            998 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            999 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board14 = mapOf(
           7 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            8 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.WAVE),
            10 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            9 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            6 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.WAVE),
            4 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            3 to Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.OVAL),
            5 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            2 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            0 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            999 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board15 = mapOf(
            7 to Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            8 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            6 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            2 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            3 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            4 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            5 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            998 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            1 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            999 to Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            0 to Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.OVAL)
    )
    val board16 = mapOf(
            11 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE),
            10 to Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            8 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            6 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            7 to Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            5 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            4 to Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            1 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            3 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            2 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            0 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    )
    val board17 = mapOf(
            11 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            10 to Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            9 to Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            8 to Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            7 to Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            6 to Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            5 to Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            4 to Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            3 to Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            0 to Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.DIAMOND),
            1 to Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.OVAL),
            2 to Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE)
    )
    val allBoards = mapOf(
            "set_board0.jpg" to board0,
            "set_board1.jpg" to board1,
            "set_board2.jpg" to board2,
            "set_board3.jpg" to board3,
            "set_board4.jpg" to board4,
            "set_board5.jpg" to board5,
            "set_board6.jpg" to board6,
            "set_board7.jpg" to board7,
            "set_board8.jpg" to board8,
            "set_board9.jpg" to board9,
            "set_board10.jpg" to board10,
            "set_board11.jpg" to board11,
            "set_board12.jpg" to board12,
            "set_board13.jpg" to board13,
            "set_board14.jpg" to board14,
            "set_board15.jpg" to board15,
            "set_board16.jpg" to board16,
            "set_board17.jpg" to board17
    )
}
