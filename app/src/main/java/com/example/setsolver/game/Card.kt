package com.example.setsolver.game

import com.google.common.collect.ImmutableList
import com.google.common.collect.Sets

enum class Fill(val fill: String) {
    FULL("full"),
    STRIPED("striped"),
    EMPTY("empty"),
}

enum class Count(val count: String) {
    ONE("1"),
    TWO("2"),
    THREE("3"),
}

enum class Color(val color: String) {
    RED("red"),
    GREEN("green"),
    PURPLE("purple"),
}

enum class Shape(val shape: String) {
    DIAMOND("diamond"),
    OVAL("oval"),
    WAVE("wave"),
}


data class Card(val fill: Fill, val count: Count, val color: Color, val shape: Shape)

data class GameSet(val cards: Set<Card>) {
    init {
        if (cards.size != 3) {
            throw RuntimeException("GameSet must consist of 3 cards, looser!")
        }
    }
}

data class Board(val cards: Set<Card>) {
    init {
        if (cards.size % 3 != 0) {
            throw RuntimeException("Board card count should be divisible by 3, looser!")
        }
    }
}

fun <T> isSameOrAllDifferent(a: T, b: T, c: T): Boolean {
    val isSame = a == b && b == c
    if (isSame) {
        return true
    }
    return a != b && b != c && a != c
}

fun isSet(cards: Set<Card>): Boolean {
    if (cards.size != 3){ throw RuntimeException("Cards are not divisible by 3")}
    val card1 = cards.elementAt(0)
    val card2 = cards.elementAt(1)
    val card3 = cards.elementAt(2)
    if (!isSameOrAllDifferent(card1.color, card2.color, card3.color))
    {
        return false
    }
    if (!isSameOrAllDifferent(card1.fill, card2.fill, card3.fill))
    {
        return false
    }
    if (!isSameOrAllDifferent(card1.count, card2.count, card3.count))
    {
        return false
    }
    return isSameOrAllDifferent(card1.shape, card2.shape, card3.shape)

}

fun Board.findSets(): List<GameSet> {
    val sets = Sets.combinations(cards, 3).filter { x -> isSet(x) }.map { x -> GameSet(x) }
    return ImmutableList.copyOf(sets)
}