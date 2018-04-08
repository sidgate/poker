package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class HighCard implements HandType {
	@Override
	public boolean validate(Hand hand) {
		return true;
	}

	@Override
	public String getName() {
		return "high-card";
	}
}
