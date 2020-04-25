package sidgate.poker

import sidgate.deck.Hand

class FullHouse(next: HandType?) : HandType(next) {
    override fun process(hand: Hand) =
            (hand.cardsGroupedByRank().any { it.size == 3 } && hand.cardsGroupedByRank().any { it.size == 2 })

    override val name: String
        get() = "full-house"
}