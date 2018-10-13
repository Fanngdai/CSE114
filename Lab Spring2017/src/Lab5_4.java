import java.util.Scanner;

/*
 *Lab 5 part 4
 * Promts user to enter an integer between 33 and 127 and it will print what the
 * number which is associated with the acsii table will print.
 */

public class Lab5_4
{
	public static void main(String[] args)
	{
		int userInput;

		try
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("Enter an integer between 33 to 127: ");
			userInput = stdin.nextInt();

			// Make sure we get an valid number
			if(userInput < 33 || userInput > 127)
			{
				System.out.print("That's not a valid input Good-bye");
				System.exit(0);
			}
			System.out.print((char)userInput);
		}
		catch(Exception ex)
		{
			System.out.print("That's not a valid input Good-bye");
			System.exit(0);
		}

	}
}
