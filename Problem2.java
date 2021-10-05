/* Chuck Hoffmann
 * CSC 200-011N
 * Professor Bhattacharya
 * October 2, 2021
 * Problem 2
 */

import java.util.Scanner;
public class Problem2 {
	
	private static final boolean DEBUG = false;

	public static void main(String[] args) {
		/* Compute income tax based on the following 
		 * rate schedule:
		 * 1% on first $50,000
		 * 2% over $50,000 to $75,000
		 * 3% over $75,000 to $100,000
		 * 4% over $100,000 to $250,000
		 * 5% over $250,000 to $500,000
		 * 6% over $500,000
		 */

		double taxableIncome = 0;
		double taxOwed = 0;
		double incomeLevels[] = {500000,250000,100000,75000,50000,0};
		
		System.out.print("Enter the taxpayer's income: ");
		try (Scanner keyboard = new Scanner(System.in)){
			taxableIncome = keyboard.nextDouble();
		}
		
		double taxRate = 0.06;
		/* Loop through the income levels with a for-each
		 * style loop. If the taxable income exceeds that
		 * income level, compute the tax and add it to
		 * the total tax owed.
		 */
		for (double level: incomeLevels) {
			if (taxableIncome > level) {
				if (DEBUG) {
					System.out.printf("%.0f%n",(taxableIncome - level) * taxRate);
					System.out.printf("%.0f%% tax rate paid on $%.2f above $%.2f.%n", taxRate*100, taxableIncome - level, level);
				}
				taxOwed += (taxableIncome - level) * taxRate;
				taxableIncome = level;
			} else {
				if (DEBUG) {
					System.out.printf("No taxes at %.2f level%n",level);
				}
			}
			taxRate = taxRate - 0.01;
		}

		System.out.printf("$%.2f in taxes owed.",taxOwed);
		
	}

}
