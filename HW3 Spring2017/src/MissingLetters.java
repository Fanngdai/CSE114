/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #3
 * Part 3: Missing Letters
 * 
 * The method in this program is given a string. The program will search through the
 * entire string and look for the lowest letter and highest letter. It will print
 * all the letters inbetween except for the letters that appeared in the string.
 * Letters are in alphabetical order.
 */
public class MissingLetters {
	public static String GetMissingLetters(String testString)
	{
		// Change all letters to lower case
		testString = testString.toLowerCase();

		// smallest is the lowest letter, largest is the highest letter
		char smallest=testString.charAt(0), largest=testString.charAt(0);
		// The letters to be returned
		String answer = "";
		// From lowest to highest letter, is there a letter in string that is in there?
		boolean hasLetter;

		// Checks all letters of string to make sure they're the smallest or largest letter
		for(int i=1; i<testString.length(); i++)
		{
			// if the letter is lower, change to that letter
			if(testString.charAt(i) < smallest)
				smallest = testString.charAt(i);
			// if the letter is higher, change to that letter
			if(testString.charAt(i) > largest)
				largest = testString.charAt(i);
		}

		// i is the letter in alphabetical order from smallest to largest
		for(char i=(char)((int)smallest+1); i<largest; i++)
		{
			hasLetter = false;
			for(int j=0; j<testString.length(); j++)
			{
				if((testString.charAt(j))==(i))
				{
					hasLetter = true;
				}
			}
			if(hasLetter != true)
			{
				System.out.print(i);
			}
		}
		return answer;
	}

	/*
	public static void main(String[] args)
	{
		// prints "pqrstuvwxy"
		System.out.println(GetMissingLetters("zoo"));
		// prints "fgijkmn"
		System.out.println(GetMissingLetters("hello"));
		// prints "bdfghijk"
		System.out.println(GetMissingLetters("Camel"));
	}
	*/
}