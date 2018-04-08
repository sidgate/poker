package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class Flush extends HandType {

	public Flush(HandType next) {
		super(next);
	}

	@Override
	protected boolean process(Hand hand) {
		return hand.cardsGroupedBySuit().size() == 1;
	}

	@Override
	public String getName() {
		return "flush";
	}

}
