package com.techelevator.cardexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	
	private List<Card> cardList = new ArrayList<Card>();
	
	public Deck() {
		Card aceSpades = new Card(1, 1);
		cardList.add(aceSpades);
		Card queenHearts = new Card(3, 12);
		cardList.add(queenHearts);
		Card tenHearts = new Card(3, 10);
		cardList.add(tenHearts);
	}
	
	public Card getCard(int index) {
		
		return this.cardList.get(index);
		
		
		// get a card from cardList
		//
		// return
//		return new Card(5, 7);
//		return new Card();
		
		// we COULD return null from here
	}
	
	public int sumRanks() {
		int sum = 0;
		
		for(Card card : cardList) {
			sum += card.getRank();
			System.out.println("new sum: " + sum + " rank added: " + card.getRank());
		}
		
		return sum;
	}
	
	public void shuffle() {
		
	}

}
