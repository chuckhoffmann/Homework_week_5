/* Chuck Hoffmann
 * CSC 200-011N
 * Professor Bhattacharya
 * October 2, 2021
 * Problem 4
 */
import java.util.Scanner;

public class Problem4 {
	/* Determine whether a given year is a leap 
	 * year. A leap year is a year that is either
	 * evenly divisible by 400 or evenly 
	 * divisible by 4 but not by 100.
	 */

	private static final boolean DEBUG = false;
	
	public static void main(String[] args) {

		int year=0;
		
		System.out.print("Enter a year: ");
		try (Scanner keyboard = new Scanner(System.in)) {
			year = keyboard.nextInt();
		}
		
		String leapYear = "No"; // Set default condition
		
		/* If year evenly divisible by 4 AND not evenly
		 * divisible by 100 OR year evenly divisible by 400
		 */ 
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
			leapYear = "Yes";
		}
		
		if (DEBUG) {
			/*Version using ternary operators 
			 * 
			 */
			leapYear = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "Yes" : "No";	
		}
		
		System.out.print(leapYear);
		
	}

}
