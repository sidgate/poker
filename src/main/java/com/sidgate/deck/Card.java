package com.sidgate.deck;

import static java.util.Objects.hash;

public class Card {
	private Suit suit;
	private Rank rank;

	public Card(String name) {
		suit = Suit.getByShortName(name.substring(0, 1));
		rank = Rank.getByShortName(name.substring(1, 2));
	}

	public Suit suit() {
		return suit;
	}

	public Rank rank() {
		return rank;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Card card = (Card) o;
		return suit == card.suit && rank == card.rank;
	}

	@Override
	public int hashCode() {
		return hash(suit, rank);
	}

	public boolean isAce() {
		return rank.equals(Rank.ACE);
	}

	@Override
	public String toString() {
		return suit.getShortName() + rank.getShortName();
	}
}
