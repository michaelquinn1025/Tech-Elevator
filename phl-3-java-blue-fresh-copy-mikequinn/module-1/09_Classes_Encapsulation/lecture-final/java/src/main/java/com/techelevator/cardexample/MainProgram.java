package com.techelevator.cardexample;

public class MainProgram {

	public static void main(String[] args) {

		// Create a new Game, which sets up the appropriate deck
		Game game = new Game();
		
		/*
		// Display the unshuffled deck
		System.out.println("Unshuffled deck:");
		System.out.println(game.getDeck().deckString());
		
		// Shuffle the deck and redisplay
		game.getDeck().shuffle();
		System.out.println("Shuffled deck:");
		System.out.println(game.getDeck().deckString());
		*/
		
//		Card test = new Card();
		/*
		Card aceSpades = new Card(1, 1);
		System.out.println(aceSpades.getRank());
		
		Card queenHearts = new Card(3, 12);
		System.out.println(queenHearts.getRank());
		
		System.out.println(aceSpades.getRank());*/
		
		Deck deck = new Deck();
		Card card1 = deck.getCard(0);
		card1.setSuit(2);;
		
		Card card3 = deck.getCard(2);
		
		Card someOtherCard = deck.getCard(0);
		//System.out.println("someOtherCard: " + someOtherCard.getSuit());
		
		int finalSum = deck.sumRanks();
		System.out.println("finalSum: " + finalSum);
	}

}
