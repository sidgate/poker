package sidgate

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import sidgate.deck.Card
import sidgate.deck.Hand

class HandTest {
    @Test
    fun testHandCards() {
        val hand = Hand(listOf(Card("H5"), Card("H6")))
        assertTrue(hand.contains(Card("H5")))
    }

    @Test
    fun testHandCardsByText() {

        val hand = Hand(cards("H5,H6"))
        assertTrue(hand.contains(Card("H5")))
    }

    private fun cards(list: String) = list.split(",").map { Card(it) }
}