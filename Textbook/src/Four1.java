/*
 * Ask User to enter the length from the center 
 * of a pentagon to a vertex and computes the 
 * area of the petagon.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Four1 {
	public static void main (String args[])
	{
		// Prompt user for input
		System.out.print("Enter the length from the center to a vertex: ");
		// User input
		Scanner input = new Scanner(System.in);

		// Transforms userinput into a double
		double radius = input.nextDouble();
		// Find the length of each side
		double side = 2*radius*Math.sin(Math.PI/5);
		// Find the area of the pentagon
		double area = (5*Math.pow(side, 2))/(4*Math.tan(Math.PI/5));

		// Round to 2 decimal
		DecimalFormat round2Decimal = new DecimalFormat(".##");
		
		// Print the area rounded to 2 decimal places
		System.out.println("The area of the pentagon is " + round2Decimal.format(area));
	}
}
