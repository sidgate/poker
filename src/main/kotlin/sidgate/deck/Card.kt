package sidgate.deck


data class Card(val suit: Suit, val rank: Rank) {
    companion object {
        fun of(name: String) = Card(Suit.getByShortName(name.substring(0, 1)), Rank.getByShortName(name.substring(1, 2)))
    }

    val isAce = rank == Rank.ACE

    override fun toString() = suit.shortName + rank.shortName
}