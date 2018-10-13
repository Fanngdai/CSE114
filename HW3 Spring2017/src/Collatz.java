/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #3
 * Part 1: Collatz conjecture
 * 
 * Collatz conjecture is a conjecture in math which shows that a given positive integer will
 * always end up at 1 such that: if the number is even, divide it by 2. If it is odd, 
 * mulitiple it by 3 and add 1. This program contains a method which returns the amount of 
 * times the number interated before reaching 1.
 */

public class Collatz {
	// The number of iterations that were performed before reaching 1.
	public static int howManyCollatzIterations(int n)
	{
		int count = 0;

		while(n!=1)
		{
			// number if even
			if(n%2==0)
			{
				n/=2;
			}
			// number if odd
			else if(n%2!=0)
			{
				n = n*3+1;
			}
			count++;
		}
		return count;
	}

	/*
	public static void main(String[] args)
	{
		// return 6
		System.out.println("Number of iterations returned by the method is: " + howManyCollatzIterations(10));
		// return 25
		System.out.println("Number of iterations returned by the method is: " + howManyCollatzIterations(100));
		// return 11
		System.out.println("Number of iterations returned by the method is: " + howManyCollatzIterations(53));
	}
	 */
}
