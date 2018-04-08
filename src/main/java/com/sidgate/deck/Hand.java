package com.sidgate.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toCollection;

public class Hand extends ArrayList<Card> {
	public Hand(List<Card> cards) {
		super(cards);
	}

	public Hand(String cards) {
		Arrays.stream(cards.split(",")).map(Card::new).forEach(this::add);
	}

	public Collection<List<Card>> cardsGroupedByRank() {
		return stream().collect(groupingBy(Card::rank)).values();
	}

	public Collection<List<Card>> cardsGroupedBySuit() {
		return stream().collect(groupingBy(Card::suit)).values();
	}

	public LinkedList<Card> sortedWithAceAdjusted() {
		LinkedList<Card> sorted = stream().sorted(comparing(Card::rank)).collect(toCollection(LinkedList::new));
		if (sorted.getFirst().rank().equals(Rank.TWO) && sorted.getLast().isAce()) {
			sorted.addFirst(sorted.getLast());
			sorted.removeLast();
		}
		return sorted;
	}
}
