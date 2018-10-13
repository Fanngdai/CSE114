import java.util.Scanner;

/*
 * Lab 3 part 1
 * Promt the user to enter 3 numbers. With the 3 numbers, sort them and print.
 */

public class Sort3 {
	public static void main(String[] args)
	{
		// Used to store the numbers user inputs
		int num1=0, num2=0, num3=0;
		int temp;

		try
		{
			// Promt user to enter digits
			System.out.print("Enter first digit: ");
			Scanner stdin = new Scanner(System.in);
			// Store entered digit to num1
			num1 = stdin.nextInt();

			System.out.print("Enter second digit: ");
			stdin = new Scanner(System.in);
			num2 = stdin.nextInt();

			System.out.print("Enter third digit: ");
			stdin = new Scanner(System.in);
			num3 = stdin.nextInt();
		}
		catch(Exception ex)
		{
			// What the user entered is not an integer. Tell user and exit program.
			System.out.print("That's not a valid digit! Good-bye!");
			System.exit(0);
		}

		// Make sure num1 has the largest digit and num3 has the lowest. By swapping
		// Comparing num3 and num2, num3 must be smaller
		if(num3 > num2)
		{
			temp = num3;
			num3 = num2;
			num2 = temp;
		}
		// num3 now has the smallest digit
		if(num3 > num1)
		{
			temp = num3;
			num3 = num1;
			num1 = temp;
		}
		// num1 has the largest digit
		if(num2 > num1)
		{
			temp = num2;
			num2 = num1;
			num1 = temp;
		}

		System.out.println("From largest to smallest, the numbers you entered are " 
				+ num1 + "," + num2 + "," + num3);
	}
}
