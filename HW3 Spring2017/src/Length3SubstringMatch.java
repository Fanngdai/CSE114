/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #3
 * Part 2: Length 3 substring match
 *
 * Given 2 strings, program will let the user know how many times the
 * two string contain the same length 3 substring.
 */
public class Length3SubstringMatch {
	public static int stringMatch3(String a, String b)
	{
		int count = 0;
		for(int i=0; i<b.length()-2 && i<a.length()-2; i++)
		{
				if(a.substring(i, i+2).equals(b.substring(i, i+2)))
					count++;
		}
		return count;
	}
	/*
	public static void main(String[] args)
	{
		// Prints 4
		System.out.println(stringMatch3("sdgndsgyudsaiufb","sadufygyudsa"));
		// Prints 4
		System.out.println(stringMatch3("bananas","banana"));
	}
	*/
}
