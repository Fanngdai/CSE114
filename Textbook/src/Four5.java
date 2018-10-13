import java.util.Scanner;

/*
 * Ask the user for the amount of sides of a regular polygon.
 * (This polygon has the same length of side and angles)
 * It will then ask the user for the length of the sides.
 * Given these information, the program will return the
 * area of such polygon
 */

public class Four5 {
	public static void main(String args[])
	{
		// The number of sides must be a whole digit
		int numberOfSide;
		// The length of each side and the area can be a double
		double sideLength, area;
		
		// Prompt the user for the number of sides
		System.out.print("Enter the number of sides: ");
		Scanner input = new Scanner(System.in);
		// Put the users input into numberOfSide
		numberOfSide = input.nextInt();
		
		// Prompt the user for the length of the sides
		System.out.print("Enter the side: ");
		input = new Scanner(System.in);
		// Put the users input into sideLength
		sideLength = input.nextDouble();
		
		// The formula used to find the area of such polygon
		area = (numberOfSide * sideLength * sideLength) / (4 * Math.tan(Math.PI / numberOfSide));
		
		// Print the area
		System.out.println("The area of the polygon is " + area);
	}
}
