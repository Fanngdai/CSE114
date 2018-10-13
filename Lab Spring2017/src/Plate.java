/*
 * Lab 4 part 3
 * Randomly generate the plate of a car which is 3 uppercase letters followed
 * by 4 digits.
 */
public class Plate
{
	public static void main(String[] args)
	{
		// Used to make sure random is 4 digits
		int fourDigits;

	System.out.print("Your plate ID is ");
	// Generates 3 capital letters and print them
	for(int i = 0; i<3; i++)
	{
		System.out.print((char)(65 + Math.random() * 25));
	}

	// Generates random number. Up to 4 digits
	fourDigits = (int)(Math.random()*10000);
	// If generated number is less than 4 digits, add zero in the front
	if(fourDigits < 10)
		System.out.print("000");
	else if (fourDigits < 100)
		System.out.print("00");
	else if (fourDigits < 1000)
		System.out.print("0");

	System.out.println(fourDigits);
	}
}
