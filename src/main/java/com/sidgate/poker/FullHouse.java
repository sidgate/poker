package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class FullHouse extends HandType {

	public FullHouse(HandType next) {
		super(next);
	}
	@Override
	protected boolean process(Hand hand) {
		return hand.cardsGroupedByRank().stream().anyMatch(list -> list.size() == 3)
			&& hand.cardsGroupedByRank().stream().anyMatch(list -> list.size() == 2);
	}

	@Override
	public String getName() {
		return "full-house";
	}

}
