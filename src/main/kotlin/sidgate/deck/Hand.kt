package sidgate.deck

class Hand(private val cards: List<Card>) {

    fun cardsGroupedByRank() = cards.groupBy { it.rank }.values

    fun cardsGroupedBySuit() = cards.groupBy { it.suit }.values

    fun sortedWithAceAdjusted(): List<Card> {
        val sorted = cards.sortedBy { it.rank }

        return if(sorted.first().rank == Rank.TWO && sorted.last().isAce) {
            listOf(sorted.last()) + sorted.subList(0, sorted.size - 2)
        }
        else sorted
    }

    fun contains(card: Card) = cards.contains(card)
}