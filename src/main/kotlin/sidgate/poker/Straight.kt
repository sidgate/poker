package sidgate.poker

import sidgate.deck.Card
import sidgate.deck.Hand

class Straight(next: HandType?) : HandType(next) {
    override fun process(hand: Hand): Boolean {
        val sorted = hand.sortedWithAceAdjusted()
        var previous: Card? = null
        for (card in sorted) {
            if (previous != null) {
                val previousRank = if (previous.isAce) -1 else previous.rank.ordinal
                if (card.rank.ordinal - previousRank != 1) {
                    return false
                }
            }
            previous = card
        }
        return true
    }

    override val name: String
        get() = "straight"
}