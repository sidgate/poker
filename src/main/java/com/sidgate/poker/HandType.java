package com.sidgate.poker;

import com.sidgate.deck.Hand;

public interface HandType {

	boolean validate(Hand hand);

	String getName();
}
