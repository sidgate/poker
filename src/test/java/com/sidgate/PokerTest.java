package com.sidgate;

import com.sidgate.poker.Poker;
import com.sidgate.deck.Hand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PokerTest {

	private final String input;
	private final String expected;

	@Parameterized.Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][]{
			{"H2,C2,D2,S2,D8", "four-of-a-kind"},
			{"H2,C2,D3,S3,H3", "full-house"},
			{"H2,H5,H6,H7,H9", "flush"},
			{"SA,HA,CA,C2,C5","three-of-a-kind"},
			{"SA,S2,S3,D4,H5", "straight"},
			{"ST,DJ,SQ,CK,SA", "straight"},
			{"S2,D3,S4,S5,S6", "straight"},
			{"S2,D2,S3,S4,C5", "pair"},
			{"S2,D3,D5,C6,SA", "high-card"}
		});
	}

	public PokerTest(String input, String expected){
		this.input = input;
		this.expected = expected;
	}

	@Test
	public void testPokerHands() {
		assertEquals(expected, new Poker().bestHand(new Hand(input)));
	}
}
