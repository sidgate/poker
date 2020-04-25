package sidgate.deck

import java.util.*

enum class Suit(val shortName: String) {
    HEART("H"), SPADE("S"), DIAMOND("D"), CLUB("C");

    companion object {
		fun getByShortName(name: String): Suit {
            return Arrays.stream(values()).filter { suit: Suit -> suit.shortName == name }.findFirst().get()
        }
    }

}