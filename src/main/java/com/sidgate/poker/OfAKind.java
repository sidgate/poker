package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class OfAKind extends HandType {
	private int count;
	private String name;

	public OfAKind(int count, String name, HandType next) {
		super(next);
		this.count = count;
		this.name = name;
	}

	protected boolean process(Hand hand) {
		return hand.cardsGroupedByRank().stream().anyMatch(cards -> cards.size() == count);
	}

	@Override
	public String getName() {
		return name;
	}
}
