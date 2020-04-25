package sidgate.poker

import sidgate.deck.Hand

abstract class HandType(private val next: HandType?) {
    fun getBestHand(hand: Hand): HandType {
        val result = process(hand)
        return if (!result && next != null) {
            next.getBestHand(hand)
        } else this
    }

    protected abstract fun process(hand: Hand): Boolean
    abstract val name: String

}