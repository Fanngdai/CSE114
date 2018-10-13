import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2_2
{
	public static void main(String[] args)
	{
		double subtotal=0, tip;

		// Make sure what is entered is an double
		try
		{
			System.out.print("Enter the subtotal: $");
			Scanner input = new Scanner(System.in);
			subtotal = input.nextDouble();
		}
		catch(Exception ex)
		{
			System.out.print("What you entered is not correct. Good-bye!");
			System.exit(0);
		}
		
		// If the bill is less than 30 the tip is 5. regardless
		if(subtotal <= 30)
			tip = 5.0;
		// If the bill is above 30 dollars, the tip is 15%
		else
			tip = subtotal * .15;
		
		// Used to round the money
		DecimalFormat roundToTwoDecimals = new DecimalFormat ("#.##");
		
		System.out.println("The gratuity is: $" + roundToTwoDecimals.format(tip) +".");
		System.out.println("The total is $" + roundToTwoDecimals.format((subtotal + tip)) + ".");
		System.exit(0);
	}
}
