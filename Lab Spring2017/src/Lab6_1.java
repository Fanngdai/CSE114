/*
 * Lab 6 part 1
 * Prints the amount of kilogram and its equivalent amount in pounds
 * It will go by every other number starting from 1
 */
public class Lab6_1
{
	public static void main(String[] args)
	{
		// Stores the equivalent amount in pounds
		double pounds;
		
		System.out.println("Kilograms \tPounds");
		for(int i=1; i< 200; i=i+2)
		{
			pounds = i*2.2;
			System.out.printf(i + "\t\t" + "%.2f",pounds);
			System.out.println();
		}
	}
}