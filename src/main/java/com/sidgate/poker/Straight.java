package com.sidgate.poker;

import com.sidgate.deck.Card;
import com.sidgate.deck.Hand;

import java.util.LinkedList;

public class Straight extends HandType {

	public Straight(HandType next) {
		super(next);
	}

	@Override
	protected boolean process(Hand hand) {
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
