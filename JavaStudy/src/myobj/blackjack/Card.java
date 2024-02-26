package myobj.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Card {

	final private static char[] SUITS = { '♠', '♣', '◇', '♡' };
	final private static String[] RANKS = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	
	final private static int[] RANK_VALUES = {
		11 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,10 ,10 ,10	
	};
	
	final public static Card SPADE_ACE = new Card(0,0);
	
	private int suit; // 문양
	private int rank; //
	private boolean reversed = false;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		if (reversed) {
			return "[XX]";
		} else {
			return String.format("[%c%s]", SUITS[suit], RANKS[rank]);
		}
	}
	
	// rank만으로 같은 카드인지 따지도록 구현
	@Override
	public int hashCode() {
		return RANKS[rank].hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
	public void toFrontSide() {
		this.reversed = false;
	}
	
	public void toBackSide() {
		this.reversed = true;
	}

	public static CardDeck getDeck(int deckSize) {
		List<Card> deck = new ArrayList<>();

		for (int i = 0; i < deckSize; ++i) {
			for (int suit = 0; suit < 4; ++suit) {
				for (int rank = 0; rank < 13; ++rank) {
					deck.add(new Card(suit, rank));
				}
			}
		}
		return new CardDeck(deck);
	}
	

	public static CardDeck getDeck() {
		List<Card> deck = new ArrayList<>();

		for (int suit = 0; suit < 4; ++suit) {
			for (int rank = 0; rank < 13; ++rank) {
				deck.add(new Card(suit, rank));

			}

		}

		return new CardDeck(deck);
	}
	
	public int getRankValue() {
		return RANK_VALUES[rank];
	}

	public static void main(String[] args) {
		System.out.println(new Card(0, 0));
		System.out.println(new Card(0, 1));

		for (int suit = 0; suit < 4; ++suit) {
			for (int rank = 0; rank < 13; ++rank) {
				System.out.println(new Card(suit, rank));
			}
		}
	}

}
