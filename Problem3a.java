import java.util.Scanner;

public class Problem3a {

	public static void main(String[] args) {

		int month = 0;
		
		System.out.print("Enter a month (1-12): ");
		try (Scanner keyboard = new Scanner(System.in)){
			month = keyboard.nextInt();
		}

		/* 
		 * First, check if the month is 4, 6, 9 or 11.
		 * If so, return "30". If not, check if the month is 2.
		 * If yes, return "28 or 29", else just return 31.
		 */
		String days = "31";
	
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = "30";
		} else if (month == 2) {
			days = "28 or 29";
		} else {
			days = "31";
		}
		
		System.out.printf("That month has %s days.",days);
		
	}
	
}
