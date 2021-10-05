import java.util.Scanner;
public class Problem2a {

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
		//double taxOwed = 0;
		//double incomeLevels[] = {500000,250000,100000,75000,50000,0};
		
		System.out.print("Enter the taxpayer's income: ");
		try (Scanner keyboard = new Scanner(System.in)){
			taxableIncome = keyboard.nextDouble();
		}
		
		double taxOwed = (taxableIncome > 500000) ? (taxableIncome - 500000) * 0.06 + 20250
				: (taxableIncome > 250000) ? (taxableIncome - 250000) * 0.05 + 7750
				: (taxableIncome > 100000) ? (taxableIncome - 100000) * 0.04 + 1750
				: (taxableIncome > 75000) ? (taxableIncome - 75000) * 0.03 + 1000
				: (taxableIncome > 50000) ? ((taxableIncome - 50000) * 0.02) + 500 
				: (taxableIncome) * 0.1 ;

		System.out.printf("$%.2f in taxes owed.",taxOwed);
		
	}

}
