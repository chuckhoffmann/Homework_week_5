/* Chuck Hoffmann
 * CSC 200-011N
 * Professor Bhattacharya
 * October 2, 2021
 * Problem 1
 */

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		/* Enter an employee's hourly wage and name,
		 * then ask how many hours the employee worked this week.
		 * If this value is over 40, those hours are to
		 * be paid at 1.5 times the employee's base wage
		 */
		String employeeName = null;
		double hourlyRate = 0;
		double hoursWorked = 0;
		double baseHours = 0;
		double overtimeHours = 0;
		double totalPay = 0;
		
		try (Scanner keyboard = new Scanner(System.in)){
			System.out.print("Enter employee name: ");
			employeeName = keyboard.nextLine();
			System.out.print("Enter employee's hourly pay rate: ");
			hourlyRate = keyboard.nextDouble();
			System.out.print("Enter the number of hours worked: ");
			hoursWorked = keyboard.nextDouble();
		}
		
		if (hoursWorked > 40.0) {
			/* Calculate overtime hours
			 */
			baseHours = 40;
			overtimeHours = hoursWorked - 40;
		} else {
			baseHours = hoursWorked;
		}
		
		totalPay = baseHours * hourlyRate + overtimeHours * (hourlyRate * 1.5);

		System.out.printf("Total pay for %s : $%.2f\n",employeeName, totalPay);
	}

}
