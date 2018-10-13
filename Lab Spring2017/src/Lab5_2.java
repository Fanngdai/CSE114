import java.util.Scanner;

/*
 * Lab5 part 2
 * Promts user to type in an integer. The program will determine if the
 * integer is divisble by 5 and 6 or divisible by either one of them.
 */

public class Lab5_2 {
	public static void main(String[] args)
	{
		int userInput;

		try
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("Enter an integer: ");
			userInput = stdin.nextInt();

			// If the number is divisble by 5 and 6
			if(userInput%5==0 && userInput%6==0)
			{
				System.out.print(userInput + " is divisible by 5 and 6.");
			}
			// If it is divisble by 5 and 6, it would satisfy the or
			else if(userInput%5==0 || userInput%6==0)
				// But if it doesn't, if it divisible by 5 or 6?
				if(userInput%5==0 ^ userInput%6==0)
				{
					if(userInput%5==0)
					{
						System.out.print(userInput + " is divisible by 5 but not 6.");
					}
					else
						System.out.print(userInput + " is divisible by 6 but not 5.");
				}
		}
		catch (Exception ex)
		{
			System.out.print("That is not a valid!");
			System.exit(0);
		}
	}
}