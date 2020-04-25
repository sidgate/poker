package sidgate.deck


data class Card(private val name: String) {
    val suit: Suit = Suit.getByShortName(name.substring(0, 1))
    val rank: Rank = Rank.getByShortName(name.substring(1, 2))

    val isAce: Boolean
        get() = rank == Rank.ACE

    override fun toString(): String {
        return suit.shortName + rank.shortName
    }
}