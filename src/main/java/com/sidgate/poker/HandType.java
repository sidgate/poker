package com.sidgate.poker;

import com.sidgate.deck.Hand;

public abstract class HandType {

	private HandType next;

	public HandType(HandType next){
		this.next = next;
	}

	public HandType getBestHand(Hand hand){
		boolean result = process(hand);

		if (!result && next != null) {
			return next.getBestHand(hand);
		}
		return this;
	}

	protected abstract boolean process(Hand hand);

	public abstract String getName();
}
