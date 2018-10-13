/*
 * Lab 4 part 1
 * Promts user to enter their soical security number. If what is entered
 * is not a ###-##-#### format, program will let the uer know that is not
 * a valid social security number. Or, it will let the user know is it.
 */
import java.util.Scanner;

public class SocialSecurityNumber {
	public static void main(String[] args)
	{
		String input = null;
		boolean isValidSSN = true;

		try
		{
			// Promt user to enter their social number
			System.out.print("Enter a SSN: ");
			Scanner stdin = new Scanner(System.in);
			// Store user input into variable "input"
			input = stdin.next();

			// Seperate the string into parts
			String[] parts = input.split("-");

			// Make sure there are two "-" dashes and in the correct place
			if(!(input.substring(3,4).equals("-") && input.substring(6,7).equals("-")))
				isValidSSN = false;

			// Make sure the length is correct
			if(parts.length!=3 || parts[0].length()!=3 || parts[1].length()!=2 || parts[2].length()!=4)
				isValidSSN = false;

			// Without the "-" array should contain integers
			Integer.parseInt(parts[0]);
			Integer.parseInt(parts[1]);
			Integer.parseInt(parts[2]);


			// If it not a social number
			if (!isValidSSN)
			{
				System.out.print(input + " is an invalid Social Security Number.");
			}
			else
			{
				System.out.print(input + " is a valid Social Security Number.");
			}

		}
		catch (Exception ex)
		{
			System.out.print(input + " is an invalid Social Security Number.");
			System.exit(0);
		}
		System.exit(0);
	}
}
