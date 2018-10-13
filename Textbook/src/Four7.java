import java.text.DecimalFormat;
import java.util.Scanner;

public class Four7 {
	public static void main (String args[])
	{
		Float radius;
		
		// Ask the user for radius and store it in correct variable
		System.out.print("Enter the radius of the bounding circle: ");
		Scanner input = new Scanner(System.in);
		radius = input.nextFloat();
		
		DecimalFormat round4Numbers = new DecimalFormat(".####");
		
		// Prints answer
		System.out.println("The coordinates of five points on the pentagon are");
		System.out.println("(" + round4Numbers.format(radius*Math.sin(Math.toRadians(108))) + ", " + round4Numbers.format(radius*Math.cos(Math.toRadians(72))) + ")");
		System.out.println("(" + round4Numbers.format(radius*Math.sin(0)) + ", " + round4Numbers.format(radius*Math.cos(0)) + ")" );
		System.out.println("(" + round4Numbers.format(radius*Math.sin(Math.toRadians(252))) + ", " + round4Numbers.format(radius*Math.cos(Math.toRadians(72))) + ")");
		System.out.println("(" + round4Numbers.format(radius*Math.sin(Math.toRadians(216))) + ", " + round4Numbers.format(radius*Math.cos(Math.toRadians(216))) + ")");
		System.out.println("(" + round4Numbers.format(radius*Math.sin(Math.toRadians(36))) + ", " + round4Numbers.format(radius*Math.cos(Math.toRadians(144))) + ")");
	}
}