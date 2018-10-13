/* Change Maker
 * Promts user to enter a integer between zero and 99. If the input is not an integer,
 * program will promt user to type again. If integer is less than 0 or greater than 99,
 * it will prompt user to type a new answer. 
 */

import java.util.Scanner;

public class Lab1_2 {
	public static void main (String args[])
	{
		// Declare variable
		int change, remain, quarter, dime, nickel, penny;
		// Counts the amount of times user enters information wrong
		int counter = 0;

		do
		{
			// Make sure input is an integer
			try
			{
				// Ask user to input their change amount
				System.out.print("Input change amount (1-99): ");
				// Store users input into variable "input"
				Scanner input = new Scanner (System.in);
				// Store the users input into variable "Change"
				change = input.nextInt();
				// Not valid if change is under 0 or greater than 99
				if(change<0 || change >99)
				{
					System.out.println("What you entered is not valid!!!");
					change = -1;
					counter++;
				}
			}
			catch(Exception ex)
			{
				// If the input is not an integer, promt the user to type again
				System.out.println("What you entered is not valid!!!");
				change = -1;
				counter++;
			}
			// Entered answer wrong 5 times. Tell user and exit program.
			if (counter == 5)
			{
				System.out.println("You have entered the wrong answer 5 times! Good-bye!");
				System.exit(0);
			}
		}while(change == -1);

		// Calculates the change
		quarter = change / 25;
		remain = change % 25;
		dime = remain / 10;
		remain = change % 10;
		nickel = remain / 5;
		remain = change % 5;
		penny = remain;

		// Prints the results
		System.out.println(quarter + " Quarters\n" + dime + " Dimes\n" + nickel + " Nickels\n" + penny + " Pennies");
	}
}
