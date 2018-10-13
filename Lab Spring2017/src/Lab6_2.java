/*
 * Lab 6 part 2
 * Prints every other amount in kilogram down a row. Next to each kilogram is the amount in pounds.
 * Next to that is the amount of pounds by 5. And its kilogram of that amount.
 */

public class Lab6_2
{
	public static void main(String[] args)
	{
		// Stores the equivalent amount in pounds
		double pounds;
		int poundBy5=15;
		
		System.out.println("Kilograms \tPounds \t\tPounds \t\tKilograms");
		for(int i=1; i< 200; i=i+2)
		{
			poundBy5 += 5;
			pounds = i*2.2;
			System.out.printf(i + "\t\t" + "%.2f",pounds);
			pounds = poundBy5 *2.2;
			System.out.printf("\t\t" + poundBy5 + "\t\t" + "%.2f",pounds);
			System.out.println();
			
		}
	}
}