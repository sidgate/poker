package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class HighCard extends HandType {

	public HighCard() {
		super(null);
	}
	@Override
	protected boolean process(Hand hand) {
		return true;
	}

	@Override
	public String getName() {
		return "high-card";
	}
}
