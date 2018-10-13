/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #3
 * Part 5: Run-Length Encoding
 * 
 * If there is more than 3 consecutive letters which are the same, we will
 * encode it so that there is a flag char in front, one of those letters
 * followed by the amount of letters that are consecutive.
 */
public class RunLengthEncoding {
	public static String encode(String message, char delimiter)
	{
		// Location of the first letter that is not the same as the previous letter
		int start = 0;
		String answer = "";

		for(int i=0; i < message.length(); i++)
			//for(int i=0; i< message.length(); i++)
		{	
			// letters don't match
			if(message.charAt(start)!=message.charAt(i))
			{
				// length is less than or equal to 3
				if(i-start<=3)
				{
					// Print the letter certain amount of times
					for(int j=start; j<i; j++)
					{
						answer += message.charAt(start);
					}
				}
				// length is more than 3
				else
				{
					answer += delimiter;
					answer += message.charAt(start);
					answer += (i-start);
				}
				// If last letter and the letter before the last is not that same, add it to answer
				if (i == message.length()-1){
					answer += message.charAt(i);
				}
				start = i;
			}
			// end of string
			else if(i==message.length()-1) 
			{
				// length is less than or equal to 3
				if(i-start+1<=3)
				{
					for(int j=start; j<=i; j++)
					{
						answer += message.charAt(start);
					}
				}
				// length is greater than 3
				else
				{
					answer += delimiter;
					answer += message.charAt(start);
					answer += (i-start+1);
				}
			}
		} 
		return answer;
	}
	/*
	public static void main(String[] args)
	{
		// $K13BCC$D15$K5MNUUU$G5
		System.out.println(encode("KKKKKKKKKKKKKBCCDDDDDDDDDDDDDDDKKKKKMNUUUGGGGG", '$'));
		// MNUUUGG
		System.out.println(encode("MNUUUGG", '$'));
		// XYZ*A6GGT*C6TTT*A14K
		System.out.println(encode("XYZAAAAAAGGTCCCCCCTTTAAAAAAAAAAAAAAK", '*'));
		// KLABC
		System.out.println(encode("KLABC", '*'));
		// A
		System.out.println(encode("A", '*'));
		// *A4
		System.out.println(encode("AAAA", '*'));
		// 
		System.out.println(encode("", '*'));
		// AAB
		System.out.println(encode("AAB", '*'));
	}
	 */
}