/*
 * Lab 6 part 3
 * Prints the miles from 1 to 10 and it's equvalent in kilometers.
 */
public class Lab6_3
{
	public static void main(String[] args)
	{
		System.out.println("Miles\tKilometers");
		for( int i = 1; i<=10; i++)
		{
			System.out.println(i + "\t" + (i*1.609));
		}
	}
}
