package com.sidgate.poker;

import com.sidgate.deck.Card;
import com.sidgate.deck.Hand;

import java.util.LinkedList;

public class Straight implements HandType {
	@Override
	public boolean validate(Hand hand) {
		LinkedList<Card> sorted = hand.sortedWithAceAdjusted();
		Card previous = null;
		for (Card card : sorted) {
			if (previous != null) {
				int previousRank = previous.isAce() ? -1 : previous.rank().ordinal();
				if (card.rank().ordinal() - previousRank != 1) {
					return false;
				}
			}
			previous = card;
		}
		return true;
	}

	@Override
	public String getName() {
		return "straight";
	}
}
