import java.util.Scanner;

/*
 * Promt user to enter an integer and determine if the integer is 
 * odd or even.
 */
public class Lab5_3 {
	public static void main(String[] args)
	{
		// Used to determine if integer is even or false
		int userInput;

		try
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			userInput = stdin.nextInt();
			
			if(userInput%2==0)
			{
				System.out.print(userInput + " is an even number!");
			}
			else System.out.print(userInput + " is not an even number!");
		}
		catch(Exception ex)
		{
			System.out.print("That's not a valid input! Good-bye!");
			System.exit(0);
		}

	}
}
