package com.sidgate.deck;

import static java.util.Arrays.stream;

public enum Rank {
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("T"),
	JACK("J"),
	QUEEN("Q"),
	KING("K"),
	ACE("A");

	private String name;

	Rank(String name) {
		this.name = name;
	}

	public static Rank getByShortName(String name) {
		return stream(values()).filter(rank -> rank.name.equals(name)).findFirst().get();
	}

	public String getShortName() {
		return name;
	}
}
