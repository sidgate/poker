package sidgate

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import sidgate.deck.Card
import sidgate.deck.Hand
import sidgate.poker.Poker

class PokerTest {

    private fun cards(list: String) = list.split(",").map { Card.of(it) }
    @TestFactory
    fun testPokerHands() = listOf(
            "H2,C2,D2,S2,D8" to "four-of-a-kind",
            "H2,C2,D3,S3,H3" to "full-house",
            "H2,H5,H6,H7,H9" to "flush",
            "SA,HA,CA,C2,C5" to "three-of-a-kind",
            "SA,S2,S3,D4,H5" to "straight",
            "ST,DJ,SQ,CK,SA" to "straight",
            "S2,D3,S4,S5,S6" to "straight",
            "S2,D2,S3,S4,C5" to "pair",
            "S2,D3,D5,C6,SA" to "high-card")
            .map { (input, expected) ->
                dynamicTest("Hand with cards $input is a $expected") {
                    assertEquals(expected, Poker().bestHand(Hand(cards(input))))
                }
            }

}