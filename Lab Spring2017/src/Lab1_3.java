import java.util.Scanner;

/*
 * Program asks for a double (celsius) and converts it to farhenheit. 
 * It will then print the fahrenheit.
 */

public class Lab1_3 {
	public static void main (String[] args)
	{
		double celsius = 0, fahrenheit;
		// Counter counts the amount of times the user enters wrong input
		int counter = 0;
		boolean flag = true;

		// Make sure the input is a double
		do
		{
			try
			{
				// Ask user to input a celsius
				System.out.print("Enter a degree in Celsius: ");
				// Store users input into variable "input"
				Scanner input = new Scanner (System.in);
				// Store the users input into variable "celsius"
				celsius = input.nextDouble();
				flag = true;
			}
			catch(Exception ex)
			{
				// If the input is not an integer, promt the user to type again
				System.out.println("That's not an integer!!!");
				counter++;
				flag = false;
			}
			// Entered answer wrong 5 times. Tell user and exit program.
			if (counter == 5)
			{
				// Tell user they have entered the wrong input wrong 5 times
				System.out.println("You have entered the wrong answer 5 times! Good-bye!");
				System.exit(0);
			}
			// If input is not valid, ask user to input again
		} while(flag == false);
		
		// Calculates fahrenheit of given celsius
		fahrenheit = (9.0/5) * celsius + 32;
		// Prints the result
		System.out.println(celsius + " in Celsius is " + fahrenheit + " in Fahrenheit.");
		
	}
}
