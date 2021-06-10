package com.techelevator.cardexample;

public class Card {
	
	private int suit;
	private int rank;
	
//	public Card() {
//		
//	}
//	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	// others can ask for suit
	public int getSuit() {
		return suit;
	}
	
	// others can ask for rank
	public int getRank() {
		return rank;
	}
	
	// others can't change suit or rank because
	// we do not provide setters
	
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	
}
