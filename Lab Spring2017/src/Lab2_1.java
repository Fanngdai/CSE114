
import java.util.Scanner;

/*
 * Ask user for a bill and the amount they gave. This program will
 * calculate the amount of 20, 10, 5, 1, quarter, dime, nickel, and
 * pennies to give back. If what the user types in is not a double number,
 * it will notify the user and exit. If what the user enters has over
 * 2 decimals, it will automatically cut off the integers after the tenth
 * place. If the price and given amount is the same, it will notify the
 * user that no change is needed to be given.
 * If what the user enters is an actual number, it will calculate the change,
 * if the change is negative, it will notify the user and exit. Otherwise,
 * it will notify the user the change and print the change.
 */
public class Lab2_1 {
	public static void main(String[] args)
	{
		// Price is the deducted amount. given is the amount taken away from
		Double price = 0.0, given = 0.0, computedChange, remainder;
		int twenty, ten, five, one, quarter, dime, nickel, changeWODecimal;

		// Make sure input is an double/integer
		try{
			// Ask the price and store it in variable "price"
			System.out.print("Price: $");
			Scanner input = new Scanner (System.in);
			// Makes sure the input has 2 decimal points
			price = (double) input.nextDouble();
			price = Double.parseDouble(String.format("%.2f", price));

			// Ask the given and store it in variable "given"
			System.out.print("From: $");
			input = new Scanner (System.in);
			// Makes sure the input has 2 decimal points
			given = (double) input.nextDouble();
			given = Double.parseDouble(String.format("%.2f", given));
		}
		catch (Exception ex)
		{
			// Tell user their input is wrong
			System.out.print("Those are not integers! Good-bye");
			// If users input is not an integer, exit program
			System.exit(0);
		}

		computedChange = given - price;

		// The difference of given and price is negative. The given should be more.
		if(computedChange < 0)
		{
			// Let user know the amount given is not correct
			System.out.print("That's not right! Customer did not give you enough money!");
			System.exit(0);
		}
		// No change is need to give back
		else if (computedChange == 0)
		{
			// Inform user they don't have to give back change
			System.out.print("No change to give back!");
			System.exit(0);
		}
		System.out.println("Computed change: $" + computedChange);

		changeWODecimal = (int)(computedChange * 100);
		
		// Computes the change
		twenty = (int) (changeWODecimal / 2000);
		remainder = (double) (changeWODecimal % 2000);
		ten = (int) (remainder / 1000);
		remainder = (double) (changeWODecimal % 1000);
		five = (int) (remainder / 500);
		remainder = (double) (changeWODecimal % 500);
		one = (int) (remainder / 100);
		remainder = (double) (changeWODecimal % 100);
		quarter = (int) (remainder / 25);
		remainder = (double) (changeWODecimal % 25);
		dime = (int) (remainder / 10);
		remainder = (double) (changeWODecimal % 10);
		nickel = (int) (remainder / 5);
		remainder = (double) (changeWODecimal % 5);
		// penny = remainder
		
		// if statements make sure you don't print if they are zero
		if (twenty != 0)
			System.out.println(twenty + " x $20 bill(s)");
		if (ten != 0)
			System.out.println(ten + " x $10 bill(s)");
		if (five != 0)
			System.out.println(five + " x $5 bill(s)");
		if (one != 0)
			System.out.println(one + " x $1 bill(s)");
		if (quarter != 0)
			System.out.println(quarter + " x quarter(s)");
		if (dime != 0)
			System.out.println(dime + " x dime(s)");
		if (nickel != 0)
			System.out.println(nickel + " x nickel(s)");
		// Do we need to give back penny?
		if (remainder != 0 && remainder >= 0.01)
			// Give the remainder an multiple it by 100 so that it becomes the amount we need to give back
			System.out.println((int)Math.ceil(remainder*100) + " x penny");

		System.exit(0);
	}
}
