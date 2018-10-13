/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Feeding the Animals
 * Homework #2
 * Part 2
 *
 * The price of dog food cost 3 times as much as those for a cats.
 * Given a budget and the amount of dogs and cats, We will calculate
 * the amount we have for each cat.
 */

public class Animals {
	public static double pricePerCat(double budget, int dogs, int cats)
	{
		// Make it so that the price for each dog equal the amount for each cat.
		dogs = dogs * 3;
		// Find the average price for each pet and return that
		return budget/(dogs+cats);
	}

	/*
	public static void main(String[] args)
	{
		// prints 13.5924064171
		System.out.print(pricePerCat(2541.78,54,25));
	}
	*/
}
