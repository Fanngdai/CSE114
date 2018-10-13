/*
 * Ask User to enter the side length
 * of a hexagon. Program will display
 * the calculated area.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Four4
{
	public static void main(String args[])
	{
		// Decalre the variables we will use
		double side, area;

		// Prompt the user for the amount of sides
		System.out.print("Enter the side: ");
		Scanner input = new Scanner(System.in);
		// Store the users input into a double variable
		side = input.nextDouble();

		// Calculate the area
		area = (6 * side * side) / (4 * Math.tan(Math.PI/6));
		
		// Used to round to 2 decimals
		DecimalFormat round2Decimal = new DecimalFormat(".##");

		// Print the area in 2 decimals
		System.out.print("The area of the hexagon is " + round2Decimal.format(area));
	}
}
