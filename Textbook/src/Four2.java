import java.util.Scanner;

/*
 * Given the latitude and longitude of 2 points,
 * this program will determine the distance 
 * between them.
 */

public class Four2 {
	public static void main(String args[])
	{
		// Declaring the variables which we will use
		double latitude1, latitude2, longitude1, longitude2;
		double distance;

		// Prompt user for the first latitude and longitude degrees
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		Scanner input = new Scanner(System.in);
		// Store users input and change it to radian
		latitude1 = Math.toRadians(input.nextDouble());
		longitude1 = Math.toRadians(input.nextDouble());
		
		// Prompt user for the second latitude and longitude degrees
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		input = new Scanner(System.in);
		// Stores users input and change it to radian
		latitude2 = Math.toRadians(input.nextDouble());
		longitude2 = Math.toRadians(input.nextDouble());

		// The formula used to calculate the distance. To prevent mistakes, first multiple the sin part
		double tempSin = Math.sin(latitude1) * Math.sin(latitude2);
		// then multiple the cos part
		double tempCos = Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2);
		// Add the sin and cos part and find the arc cos of that. then multiple by the earth radius
		distance = 6371.01 * Math.acos(tempSin + tempCos);
		
		// Print the distance
		System.out.println("The distance between the two points is " + distance + " km.");
	}
}