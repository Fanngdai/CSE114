import java.util.Scanner;

/*
 * Lab 5 part 1
 * Computes the perimete of a triangle.
 * It promts the user to type in 3 digits and computes the perimeter of the triangle
 * If the sum of 2 edges are larger than the third or if the input is not a digit, 
 * it will tell the user the input is not valid. Otherwise, it would print the answer.
 */
public class Lab5_1 {
	public static void main(String[] args)
	{
		// The input of each side
		double first, second, third;

		try
		{
			System.out.print("Enter first side: ");
			Scanner stdin = new Scanner(System.in);
			first = stdin.nextDouble();

			System.out.print("Enter second side: ");
			second = stdin.nextDouble();

			System.out.print("Enter third side: ");
			third = stdin.nextDouble();

			if(first + second < third || first + third < second || second + third < first)
			{
				System.out.print("Your input is not valid. Good-bye!");
				System.exit(0);
			}
			
			System.out.print("The perimeter is " + (first + second + third));
		}
		catch(Exception ex)
		{
			System.out.print("Your input is not valid. Good-bye!");
			System.exit(0);
		}
	}
}
