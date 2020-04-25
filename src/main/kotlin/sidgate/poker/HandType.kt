package sidgate.poker

import sidgate.deck.Card
import sidgate.deck.Hand

sealed class HandType(private val next: HandType?) {
    fun getBestHand(hand: Hand): HandType {
        val result = process(hand)
        return if (!result && next != null) next.getBestHand(hand) else this
    }

    abstract fun process(hand: Hand): Boolean
    abstract val name: String
}

class HighCard(override val name: String = "high-card") : HandType(null) {
    override fun process(hand: Hand) = true
}

class OfAKind(private val count: Int, override val name: String, next: HandType?) : HandType(next) {
    override fun process(hand: Hand) =
            hand.cardsGroupedByRank().any { it.size == count }

}

class Straight(next: HandType?, override val name: String = "straight") : HandType(next) {
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
}

class FullHouse(next: HandType?, override val name: String = "full-house") : HandType(next) {
    override fun process(hand: Hand) =
            hand.cardsGroupedByRank().any { it.size == 3 } && hand.cardsGroupedByRank().any { it.size == 2 }

}

class Flush(next: HandType?, override val name: String = "flush") : HandType(next) {
    override fun process(hand: Hand) = hand.cardsGroupedBySuit().size == 1
}