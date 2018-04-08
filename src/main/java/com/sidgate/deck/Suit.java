package com.sidgate.deck;

import static java.util.Arrays.stream;

public enum Suit {
	HEART("H"),
	SPADE("S"),
	DIAMOND("D"),
	CLUB("C");

	private String shortName;

	Suit(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public static Suit getByShortName(String name) {
		return stream(values()).filter(suit -> suit.shortName.equals(name)).findFirst().get();
	}
}
