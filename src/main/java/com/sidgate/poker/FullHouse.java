package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class FullHouse implements HandType {
	@Override
	public boolean validate(Hand hand) {
		return hand.cardsGroupedByRank().stream().anyMatch(list -> list.size() == 3)
			&& hand.cardsGroupedByRank().stream().anyMatch(list -> list.size() == 2);
	}

	@Override
	public String getName() {
		return "full-house";
	}

}
