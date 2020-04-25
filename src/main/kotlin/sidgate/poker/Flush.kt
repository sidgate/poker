package sidgate.poker

import sidgate.deck.Hand

class Flush(next: HandType?) : HandType(next) {
    override fun process(hand: Hand) = hand.cardsGroupedBySuit().size == 1

    override val name: String
        get() = "flush"
}