package com.sidgate.poker;

import com.sidgate.deck.Hand;

public class Poker {
	private final HandType bestHandTypeChain;

	public Poker() {
		bestHandTypeChain = new OfAKind(4, "four-of-a-kind",
			new FullHouse(
				new Flush(
					new Straight(
						new OfAKind(3, "three-of-a-kind",
							new OfAKind(2, "pair",
								new HighCard()))))));
	}

	public String bestHand(Hand hand) {
		return bestHandTypeChain.getBestHand(hand).getName();
	}
}
