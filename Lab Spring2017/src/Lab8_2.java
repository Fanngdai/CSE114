/*
 * Lab 8 part 2
 * Promts user to enter an integer of any length.
 * Program will reverse the number and print it.
 */
import java.util.Scanner;

public class Lab8_2 {
	// reverse number
	public static void reverse(int number)
	{
		// digits is used to multiple when reversing number
		int reverse = 0, digits = 0;
		// We need number so we use temp
		int temp = number;
		
		// How many digit places are in the number?
		while(temp!=0)
		{
			// 0*anyNumber = 0
			if (digits == 0)
				digits = 1;
			else 
				digits *= 10;
			temp /= 10;
		}
		
		while(digits>=1)
		{
			// The last digit mulitiplied by digits so it goes in the right order
			reverse += (number%10) * digits;
			// Remove a digit place
			digits /= 10;
			// Remove last digit
			number /= 10;
		}
		System.out.print(reverse);
	}
	
	public static void main(String[] args)
	{
		int number;
		
		try
		{
		System.out.print("Enter an integer to be reverse: ");
		Scanner stdin = new Scanner(System.in);
		number = stdin.nextInt();
		
		System.out.print("The reverse of what you typed is ");
		// Prints the reverse number
		reverse(number);
		}
		catch(Exception ex)
		{
			System.out.print("That's not an integer! Good-bye!");
			System.exit(0);
		}
	}
}
