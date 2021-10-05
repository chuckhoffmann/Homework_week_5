/* Chuck Hoffmann
 * CSC 200-011N
 * Professor Bhattacharya
 * October 2, 2021
 * Problem 5
 */

import java.util.Scanner;
import java.util.Random;

public class Problem5 {

	private static final boolean DEBUG = false;
	private static final int MAXGUESSES = 5;

	public static void main(String[] args) {

		boolean win = false;
		int guessCount = 0;
		String mysteryNumber  = "53840";
		String playerGuess;
		
		/* This code runs only if DEBUG is true
		 * It generates a new random number from 0 
		 * to 99999, then converts it to a string
		 * with left-padding zeroes (if needed)
		 */
		if (DEBUG) {
			Random rand = new Random();
			int randomNumber = rand.nextInt(100000);
			mysteryNumber = String.format("%05d",randomNumber);
			System.out.println(mysteryNumber);
		}
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//Get guess from player
			System.out.print("What's your guess? ");
			playerGuess = keyboard.next("[0-9]{5}");
			
			// Compare to mystery number 
			if (playerGuess.equals(mysteryNumber)) {
				//If exact match, player wins	
				win = true;
			} else {
				
				/* Else parse for number position matches 
				 * and sums, then print.
				 */				
				int numberOfMatches = 0;
				int sumOfMatches = 0;
				
				for (int i = 0; i < 5; i++) {
					if (playerGuess.charAt(i) == mysteryNumber.charAt(i)) {
						numberOfMatches++;
						int v = Integer.parseInt(playerGuess.substring(i,i+1));
						sumOfMatches = sumOfMatches + v;
					}

				}
				System.out.printf("You got %d right and they sum to %d.%n", numberOfMatches, sumOfMatches);
			}
			
			guessCount += 1;
			
		} while ((guessCount < MAXGUESSES) && !(playerGuess.equals(mysteryNumber)));
		
		keyboard.close();
		
		if (win) {
			System.out.println("You won!");
		} else {
			System.out.println("You lost...");
		}
		
	}

}
