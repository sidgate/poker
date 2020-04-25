package sidgate.deck

enum class Rank(val shortName: String) {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    companion object {
        fun getByShortName(name: String) = values().first { it.shortName == name }
    }
}