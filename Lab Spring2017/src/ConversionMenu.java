/*
 * Lab 3  part 3
 * Promt user to enter a letter from A to E.
 * A – convert pounds to kilos
 * B – convert kilos to pounds
 * C – convert kilometers to miles
 * D – convert miles to kilometers
 * E - Exit
 * 
 * With the command given, it will ask for 
 * either pounds, kilos, kilometers or miles.
 * Given, it will print what it would be
 * converted to.
 * 
 * Same program as Lab7 part 2 except no methods used here.
 */

import java.util.Scanner;

public class ConversionMenu {
	public static void main(String[] args)
	{
		String userCommand="E";
		double userInput=0, answer=0;

		// Tells user the options. (Once only, in the beginning)
		System.out.println("A - convert pounds to kilos");
		System.out.println("B – convert kilos to pounds");
		System.out.println("C – convert kilometers to miles");
		System.out.println("D – convert miles to kilometers");
		System.out.println("E - Exit");

		do
		{
			try
			{
				// Ask for what cammand
				System.out.print("Enter your option: ");
				Scanner stdin = new Scanner(System.in);
				userCommand = stdin.next();
				// Make users command uppercase to avoid using .equalsIgnoreCase
				userCommand = userCommand.toUpperCase();

				// Continue to ask for a command if input is not correct
				while(!(userCommand.equals("A") || userCommand.equals("B")  
						|| userCommand.equals("C") || userCommand.equals("D") 
						|| userCommand.equals("E")))
				{
					System.out.println("");
					System.out.println("That's not valid! Try again.");
					System.out.print("Enter your option: ");
					stdin = new Scanner(System.in);
					userCommand = stdin.next();
					userCommand = userCommand.toUpperCase();
				}

				// Command "E" exits program.
				if(userCommand.equals("E"))
				{
					System.out.print("Good-bye!");
					System.exit(0);
				}
				else if (userCommand.equals("A"))
				{
					// Promt for a digit
					System.out.print("Enter a quantity in pounds: ");
					stdin = new Scanner(System.in);
					// Store input into variable
					userInput = stdin.nextDouble();
					// Convert pound to kilogram, store in variable answer
					answer = userInput * 0.453592;
					// Print converted to and the amount
					System.out.printf("Kilograms are: %.2f", answer);
				}
				else if (userCommand.equals("B"))
				{
					System.out.print("Enter a quantity in kilos: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					// Convert kilogram to pound, store in variable answer
					answer = userInput * 2.20462262185;
					System.out.printf("Pounds are: %.2f", answer);
				}
				else if (userCommand.equals("C"))
				{
					System.out.print("Enter a quantity in kilometers: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					// Convert kilometer to mile, store in variable answer
					answer = userInput * 0.621371;
					System.out.printf("Miles are: %.2f", answer);
				}
				else if (userCommand.equals("D"))
				{
					System.out.print("Enter a quantity in miles: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					// Convert kilogram to pound, store in variable answer
					answer = userInput * 1.609344;
					System.out.printf("Kilometers are: %.2f", answer);
				}
			}
			catch (Exception ex)
			{
				System.out.print("That's not valid! Try again.");
			}
			// Skip a line 
			System.out.println("\n");
		}while(!(userCommand.equals("E")));
	}
}