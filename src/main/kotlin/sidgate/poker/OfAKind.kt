package sidgate.poker

import sidgate.deck.Hand

class OfAKind(private val count: Int, override val name: String, next: HandType?) : HandType(next) {
    override fun process(hand: Hand) =
            hand.cardsGroupedByRank().any { it.size == count }

}