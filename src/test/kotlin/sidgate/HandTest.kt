package sidgate

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import sidgate.deck.Card
import sidgate.deck.Hand

class HandTest {
    @Test
    fun testHandCards() {
        val hand = Hand(listOf(Card.of("H5"), Card.of("H6")))
        assertTrue(hand.contains(Card.of("H5")))
    }

    @Test
    fun testHandCardsByText() {

        val hand = Hand(cards("H5,H6"))
        assertTrue(hand.contains(Card.of("H5")))
    }

    private fun cards(list: String) = list.split(",").map { Card.of(it) }
}