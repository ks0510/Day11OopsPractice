/*
 * This java program to initialize suit and rank of deck of cards and shuffle it after that distribute
 * 9 cards to 4 players and display the cards of players.
 */
package oops;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */
public class DeckofCards {

	/*
	 * This is main function of our program
	 */

	public static void main(String[] args) {

		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		int[] deck = new int[52];

		// Initialize cards
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		/*
		 * To distribute cards between four player and print there cards
		 */

		System.out.println("Player 1 got these cards");

		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}

		System.out.println("Player 2 got these cards");

		for (int i = 4; i < 8; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}

		System.out.println("Player 3 got these cards");

		for (int i = 7; i < 11; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}

		System.out.println("Player 4 got these cards");

		for (int i = 11; i < 15; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println(rank + " of " + suit);
		}
	}
}
