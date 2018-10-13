/*
 * Lab 8 part 1
 * 
 * Promts user to enter an integer. Using the given integer,
 * program will print a triangle such that
 * 
 * 1
 * 2 1
 * 3 2 1
 * ...
 * n n-1 ... 3 2 1
 * 
 * will print.
 */

import java.util.Scanner;

public class Lab8_1 {
	public static void main(String[] args)
	{
		int n;

		System.out.print("Enter a digit for n: ");
		try
		{
			Scanner stdin = new Scanner(System.in);
			n = stdin.nextInt();

			for(int i=1; i<=n; i++)
			{
				for(int j=i; j>0; j--)
				{
					System.out.print(j + " ");
				}
				System.out.println();
			}
		}
		catch(Exception ex)
		{
			System.out.print("That's not a valid input! Good-bye!");
		}
	}
}