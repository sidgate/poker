package sidgate

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import sidgate.deck.Card
import sidgate.deck.Rank
import sidgate.deck.Suit

class CardTest {
    @Test
    fun testCreateCard() {
        val card = Card("H5")
        assertEquals(Suit.HEART, card.suit)
        assertEquals(Rank.FIVE, card.rank)
    }
}