/*
 * Lab 17 part 3
 */
public class HexFormatException extends Exception{
	public HexFormatException(){
		super();
	}
	public HexFormatException(String message){
		super(message);
	}
}

/*
class Testing extends HexFormatException{
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
	
	public static void main(String[] args) throws HexFormatException {
		String binary = "12345ABCDEFP";
		for(int i=0; i<binary.length(); i++){
			if((binary.charAt(i)<48 || binary.charAt(i)>57) && (binary.charAt(i)<'A' || binary.charAt(i)>'F')){
				throw new HexFormatException("NO");
			}
		}
		System.out.print(base2base(binary, 16, 10));
	}
*/