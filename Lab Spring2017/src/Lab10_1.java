/*
 * Lab 10 part 1
 * Prompts user to enter the size of 2d array. Then, it will ask user
 * to fill in the 2d array. When the 2d array is full, program will
 * use the sumColumn method to calculate the sums of each column.
 */
import java.util.*;

public class Lab10_1 {
	// Adds the column of a given array. c is the column.
	public static double sumColumn(double[][] m, int c)
	{
		double sum = 0;
		for(int i=0; i<m[c].length; i++)
		{
			sum += m[c][i];
		}
		return sum;
	}

	public static void main(String[] args)
	{
		int row, column;

		try
		{
			// Ask user for amount of row
			System.out.print("How many rows: ");
			Scanner stdin = new Scanner(System.in);
			row = stdin.nextInt();

			// Ask user for amount of column
			System.out.print("How many columns: ");
			stdin = new Scanner(System.in);
			column = stdin.nextInt();

			// Decalre array of users choice
			double[][] matrix = new double[row][column];

			// Fills up 2d array
			for(int c=0; c<column; c++)
			{
				System.out.println("Enter " + row + " doubles for row " + c);
				for(int r=0; r<row; r++)
				{
					stdin = new Scanner(System.in);
					matrix[r][c] = stdin.nextDouble();
				}
			}

			for(int c=0; c<column; c++)
			{
				for(int r=0; r<row; r++)
				{				
					System.out.print(matrix[r][c] + " ");
				}
				System.out.println();
			}
			
			System.out.println();

			for(int i=0; i<row; i++)
			{
				System.out.println("The sum of column " + i +" is " + sumColumn(matrix, i) + ".");
			}
		}
		catch(Exception ex)
		{
			System.out.print("Uh-oh! Something went wrong!");
			System.exit(0);
		}
	}
}
