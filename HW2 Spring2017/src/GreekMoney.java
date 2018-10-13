/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Show Me the Money
 * Homework #2
 * Part 3
 *
 * Given talents, minae, drachmae and oboloi, this program
 * will convert them into oboloi. Of which each coin is worth
 * a certain amount of another. By conveting the bigger ones
 * into smaller ones and continue to convert it smaller, this
 * program will return how much oboloi those coins are worth.
 */

public class GreekMoney {
	public static int howManyOboloi(int talents, int minae, int drachmae,
			int oboloi)
	{
		// Convert talents to minae and add the original amount of minae
		minae = minae + (talents * 60);
		// convert minae to drachmae and add the original amount of dranchmae
		drachmae = drachmae + (minae * 70);
		// convert drachmae to oboloi and add original amount of oboloi
		oboloi = oboloi + (drachmae * 6);
		return oboloi;
	}

	/*
	public static void main(String[] args)
	{
		// prints 64197
		System.out.print(howManyOboloi(1, 32, 59, 3));
	}
	*/
}
