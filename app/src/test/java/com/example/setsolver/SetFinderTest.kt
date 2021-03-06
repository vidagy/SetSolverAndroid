package com.example.setsolver

import com.example.setsolver.game.*
import com.google.common.collect.Iterables
import org.junit.Test

import org.junit.Assert.*


class SetFinderTest {
    private val card1 = Card(Fill.FULL, Count.ONE, Color.RED, Shape.OVAL)
    private val card2 = Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.OVAL)
    private val card3 = Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL)
    private val card4 = Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.WAVE)
    private val card5 = Card(Fill.EMPTY, Count.THREE, Color.RED, Shape.DIAMOND)
    private val card6 = Card(Fill.EMPTY, Count.THREE, Color.PURPLE, Shape.DIAMOND)
    private val card7 = Card(Fill.STRIPED, Count.ONE, Color.RED, Shape.DIAMOND)
    private val card8 = Card(Fill.STRIPED, Count.TWO, Color.GREEN, Shape.DIAMOND)
    private val card9 = Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.WAVE)
    private val card10 = Card(Fill.EMPTY, Count.ONE, Color.RED, Shape.DIAMOND)
    private val card11 = Card(Fill.FULL, Count.TWO, Color.GREEN, Shape.DIAMOND)
    private val card12 = Card(Fill.EMPTY, Count.ONE, Color.PURPLE, Shape.DIAMOND)

    @Test
    fun isSetThatIsSet() {
        assert(isSet(setOf(card1, card2, card3)))
    }

    @Test
    fun isSetThatIsFalseNotset() {
        val card1 = Card(Fill.FULL, Count.ONE, Color.GREEN, Shape.OVAL)
        val card2 = Card(Fill.STRIPED, Count.TWO, Color.PURPLE, Shape.OVAL)
        val card3 = Card(Fill.EMPTY, Count.THREE, Color.GREEN, Shape.OVAL)
        assertFalse(isSet(setOf(card1, card2, card3)))
    }

    @Test
    fun test_isSameOrAllDifferent_same() {
        assert(isSameOrAllDifferent(Fill.FULL, Fill.EMPTY, Fill.STRIPED))
        assert(isSameOrAllDifferent(Count.ONE, Count.TWO, Count.THREE))
        assert(isSameOrAllDifferent(Color.PURPLE, Color.RED, Color.GREEN))
        assert(isSameOrAllDifferent(Shape.OVAL, Shape.WAVE, Shape.DIAMOND))

        for (p in listOf(
                Fill.FULL, Fill.EMPTY, Fill.STRIPED,
                Count.ONE, Count.TWO, Count.THREE,
                Color.PURPLE, Color.RED, Color.GREEN,
                Shape.OVAL, Shape.WAVE, Shape.DIAMOND)
        ) {
            assert(isSameOrAllDifferent(p, p, p))
        }
    }

    @Test
    fun test_find_all_sets() {
        val board = Board(setOf(
                card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12
        ))
        val expectedSets = listOf(
                GameSet(setOf(card1, card2, card3)),
                GameSet(setOf(card3, card4, card5)),
                GameSet(setOf(card3, card8, card9)),
                GameSet(setOf(card2, card5, card9)),
                GameSet(setOf(card1, card4, card8)),
                GameSet(setOf(card6, card7, card11)))

        Iterables.elementsEqual(expectedSets, board.findSets())
    }
}