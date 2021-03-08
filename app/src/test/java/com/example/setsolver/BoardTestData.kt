package com.example.setsolver

import com.example.setsolver.game.*

class BoardTestData {
    val board0 = Board(setOf(
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND)
    ))
    val board1 = Board(setOf(
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE)
    ))
    val board2 = Board(setOf(
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND)
    ))
    val board3 = Board(setOf(
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND)
    ))
    val board4 = Board(setOf(
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE)
    ))
    val board5 = Board(setOf(
            Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.OVAL)
    ))
    val board6 = Board(setOf(
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.RED, Shape.WAVE)
    ))
    val board7 = Board(setOf(
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.WAVE)
    ))
    val board8 = Board(setOf(
            Card(Fill.FULL, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.STRIPED, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.DIAMOND)
    ))
    val board9 = Board(setOf(
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board10 = Board(setOf(
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board11 = Board(setOf(
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.WAVE)
    ))
    val board12 = Board(setOf(
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board13 = Board(setOf(
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board14 = Board(setOf(
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.OVAL),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board15 = Board(setOf(
            Card(Fill.STRIPED, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.GREEN, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board16 = Board(setOf(
            Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.WAVE),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.WAVE),
            Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.ONE, Color.PURPLE, Shape.WAVE),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.FULL, Count.THREE, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.PURPLE, Shape.OVAL)
    ))
    val board17 = Board(setOf(
            Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND),
            Card(Fill.FULL, Count.TWO, Color.RED, Shape.DIAMOND),
            Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.EMPTY, Count.TWO, Color.GREEN, Shape.OVAL),
            Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE),
            Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.THREE, Color.RED, Shape.OVAL),
            Card(Fill.STRIPED, Count.TWO, Color.RED, Shape.WAVE),
            Card(Fill.FULL, Count.TWO, Color.PURPLE, Shape.DIAMOND),
            Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.OVAL),
            Card(Fill.FULL, Count.ONE, Color.PURPLE, Shape.WAVE)
    ))
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
