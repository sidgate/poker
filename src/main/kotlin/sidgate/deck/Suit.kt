package sidgate.deck

enum class Suit(val shortName: String) {
    HEART("H"), SPADE("S"), DIAMOND("D"), CLUB("C");

    companion object {
		fun getByShortName(name: String) = values().first { it.shortName == name }
    }

}