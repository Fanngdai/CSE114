/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #3
 * Part 4: Base Conversion
 * 
 * This program contains a method which is has passed parameters of an string and 2 integers. The string is
 * the converting number which we will deal with. The first integer is the base of the given string. The 
 * second base is the base number we will convert to. Method will return the original passed in value in
 * the form of the second integer/base given.
 * 
 * A = 65 in ascii table
 * A = 10 in bases numbers
 * 65-10=55
 * add or sub 55 to int and char it to become right letter
 *
 *The formula to convert any base to decimal base is
 *Starting from the last character of the string, you multiple it by the base number to the power of i.
 *For which i starts at 0 and increments by 1 as you move left of the string.
 */

public class BaseToBase {
	public static String base2base(String n, int b1, int b2)
	{
		// Convert b1 to decimal store in decimalNumber
		int decimalNumber = 0;
		// convert decimal to given base. Answer but reversed
		String reverse="";
		// Used to convert from decimal to b2
		int remainder;
		// reverse variable "reverse" to have result
		String answer="";

		// Convert to decimal. Start from right go left.
		for(int i=n.length()-1; i>=0; i--)
		{	
			// Is a digit
			if(n.charAt(i)<'9')
			{
				// a given digit in char, change to integer
				decimalNumber += (n.charAt(i)-'0') * Math.pow(b1, n.length()-i-1);
			}
			// Is a letter
			else
			{
				// a given letter in char, change to integer
				decimalNumber += ((int)n.charAt(i)-55) * Math.pow(b1, n.length()-i-1);
			}
		}

		// Converts from decimal to b2 but string is reversed.
		do
		{
			// remainder is what you want to convert to the base
			remainder = decimalNumber % b2;
			// decimalNumber is what you have left to convert
			decimalNumber /= b2;

			// This is a digit
			if(remainder < 10)
			{
				// convert it to a char and add into string
				reverse += (char)(remainder+'0');
			}
			// This is a letter
			else
			{
				// convert it to a char and add into string
				reverse += (char)(remainder+55);
			}
			// There is something left to convert so restart loop
		}while(decimalNumber!=0);

		// Reverses variable "reverse" to obtain answer
		for(int i=reverse.length()-1; i>=0; i--)
		{
			// Starting from the last letter of reverse, copy it to answer
			answer += reverse.charAt(i);
		}

		return answer;
	}
	
	public static void main(String[] args)
	{
		// Prints 3511
		System.out.println(base2base("12345", 6, 8));
		// Prints 10A998F
		System.out.println(base2base("STONY", 36, 19));
		// Prints 4D45A9
		System.out.println(base2base("832K1", 26, 15));

	}
}
