package sidgate.poker

import sidgate.deck.Hand

class HighCard : HandType(null) {
    override fun process(hand: Hand) = true

    override val name: String
        get() = "high-card"
}