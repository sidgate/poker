package com.sidgate;

import com.sidgate.deck.Card;
import com.sidgate.deck.Hand;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

public class HandTest {

	@Test
	public void testHandCards() {
		Hand hand = new Hand(asList(new Card("H5"), new Card("H6")));
		assertTrue(hand.contains(new Card("H5")));
	}

	@Test
	public void testHandCardsByText() {
		Hand hand = new Hand("H5,H6");
		assertTrue(hand.contains(new Card("H5")));
	}
}
