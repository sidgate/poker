package sidgate.poker

import sidgate.deck.Hand

class Poker {
    private val bestHandTypeChain: HandType
    fun bestHand(hand: Hand): String {
        return bestHandTypeChain.getBestHand(hand).name
    }

    init {
        bestHandTypeChain = OfAKind(4, "four-of-a-kind",
                FullHouse(
                        Flush(
                                Straight(
                                        OfAKind(3, "three-of-a-kind",
                                                OfAKind(2, "pair",
                                                        HighCard()))))))
    }
}