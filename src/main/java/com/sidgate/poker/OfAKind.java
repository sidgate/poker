package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class OfAKind implements HandType {
	private int count;
	private String name;

	public OfAKind(int count, String name) {
		this.count = count;
		this.name = name;
	}

	public boolean validate(Hand hand) {
		return hand.cardsGroupedByRank().stream().anyMatch(cards -> cards.size() == count);
	}

	@Override
	public String getName() {
		return name;
	}
}
