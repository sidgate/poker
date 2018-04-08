package com.sidgate.poker;

import com.sidgate.deck.Hand;

import java.util.Arrays;
import java.util.List;

public class Poker {
	private final List<HandType> orderedBestHands;

	public Poker() {
		orderedBestHands = Arrays.asList(
			new OfAKind(4, "four-of-a-kind"),
			new FullHouse(),
			new Flush(),
			new Straight(),
			new OfAKind(3, "three-of-a-kind"),
			new OfAKind(2, "pair"),
			new HighCard()
		);
	}

	public String bestHand(Hand hand) {
		return orderedBestHands.stream()
			.filter(type -> type.validate(hand))
			.findFirst().get().getName();
	}
}
