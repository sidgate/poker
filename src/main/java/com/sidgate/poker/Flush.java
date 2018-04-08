package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class Flush implements HandType {
	@Override
	public boolean validate(Hand hand) {
		return hand.cardsGroupedBySuit().size() == 1;
	}

	@Override
	public String getName() {
		return "flush";
	}

}
