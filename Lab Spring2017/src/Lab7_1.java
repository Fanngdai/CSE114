import java.util.Scanner;

/*
 * Lab 7 part 1
 * Reads in a certain amount of integers and determines the amount of pos and neg
 * integers entered. Program will compute the total and average of the input integers.
 * Once 0 is entered, program stops asking for integers and prints the average and total.
 */

public class Lab7_1 {
	public static void main(String [] args)
	{
		// Counts the amount of numbers entered. 0 counts as 1 so we start with neg 1.
		int count = -1;
		// input stores users input. total adds up users input. neg and pos counts the amount of pos and neg numbers.
		int input = 0, total = 0, neg = 0, pos = 0;
		// Will store the average amount of users input
		float average;

		System.out.print("Please enter digits: ");
		Scanner stdin = new Scanner(System.in);

		try
		{
			do
			{
				if(!stdin.hasNext())
					stdin = new Scanner(System.in);
				input = stdin.nextInt();
				// Counts amount of numbers
				count++;
				// Adds up all numbers
				total += input;

				if(input < 0)
					neg++;
				else if(input > 0)
					pos++;
			} while (input != 0 && stdin.hasNext());

			// calculates the average
			average = total / count;
			System.out.println("The total  amount of integer(s) entered is: " + count);
			System.out.println("The negative integer(s) entered is: " + neg);
			System.out.println("The positive integer(s) entered is: " + pos);
			System.out.println("The sum of the integer(s) entered is: " + total);
			System.out.println("The average of the integer(s) entered is: " + average);
		}
		catch(Exception ex)
		{
			System.out.print("what you entered is not an integer. Good-bye!");
			System.exit(0);
		}
	}
}
