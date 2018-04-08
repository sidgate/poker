package com.sidgate;

import com.sidgate.deck.Card;
import com.sidgate.deck.Rank;
import com.sidgate.deck.Suit;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
	@Test
	public void testCreateCard() {
		Card card = new Card("H5");
		Assert.assertEquals(Suit.HEART, card.suit());
		Assert.assertEquals(Rank.FIVE, card.rank());
	}
}
