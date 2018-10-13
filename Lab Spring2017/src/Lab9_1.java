/*
 * Lab 9 part 1 - Printing distinct numbers
 * Ask user to enter 10 integers which are stored into an array. 
 * Print each number once (even if there is a duplicate).
 * 
 */
import java.util.*;

public class Lab9_1
{
	public static void main(String[] args)
	{
		int[] input = new int[10];

		System.out.println("Enter 10 integers: ");
		Scanner stdin = new Scanner(System.in);
		// Stores all user input into array (regardless of duplicates)
		for(int i=0; i<10; i++)
		{
			input[i] = stdin.nextInt();
		}

		System.out.println("Here are the numbers without dulplicates: ");

		// Scans through array
		for(int i=0; i<10; i++)
		{	
			// Checks for duplicates.
			for(int j=i; j>=0; j--)
			{
				// If digits overlap, skip digit
				if( i!=j && input[i]==input[j] && i!=0)
				{
					break;
				}
				// If we checked all digits in array, print digit
				else if(i==0 || j==0)
				{
					System.out.print(input[i] + " ");
				}
			}
		}
	}
}