import java.util.Scanner;

/*
 * Program asks user to enter
 * A for pounds to kilos
 * B for kilos to pounds
 * C for kilometers to miles
 * D for miles to kilometers
 * E for exit
 * 
 * With the command given, user will ask for either pounds, kilos, kilometers
 * or miles and convert it to what is desired. It will then print the result.
 * 
 * Same as Lab 3 part 3. (ConversionMenu.java except we use method here for conversion.
 */
public class Lab7_2 {
	public static double poundsToKilos(double pounds)
	{
		// Convert pound to kilogram
		return (pounds*0.453592);
	}

	public static double kilosToPounds(double kilos)
	{
		// Convert kilogram to pound
		return(kilos*2.20462262185);
	}

	public static double kmToM(double km)
	{
		// Convert kilometer to mile
		return(km*0.621371);
	}

	public static double mToKm(double m)
	{
		// Convert kilogram to pound
		return(m*1.609344);
	}

	public static void main(String[] args)
	{
		// What the user inputs
		String userCommand="E";
		double userInput;

		// Lets user know what the options are once when program is prompted
		System.out.println("A for pounds to kilos");
		System.out.println("B for kilos to pounds");
		System.out.println("C for kilometers to miles");
		System.out.println("D for miles to kilometers");
		System.out.println("E for exit program");

		do
		{
			try
			{
				// Ask for what cammand
				System.out.print("Enter your option: ");
				Scanner stdin = new Scanner(System.in);
				userCommand = stdin.next();
				// Make users command uppercase to avoid using .equalsIgnoreCase
				userCommand = userCommand.toUpperCase();

				// Continue to ask for a command if input is not correct
				while(!(userCommand.equals("A") || userCommand.equals("B")  
						|| userCommand.equals("C") || userCommand.equals("D") 
						|| userCommand.equals("E")))
				{
					System.out.println("");
					System.out.println("That's not valid! Try again.");
					System.out.print("Enter your option: ");
					stdin = new Scanner(System.in);
					userCommand = stdin.next();
					// Changes to upper case so we don't have to deal with case sensitivity
					userCommand = userCommand.toUpperCase();
				}

				switch (userCommand)
				{
				case "E":
					System.out.print("Good-bye!");
					System.exit(0);
				case "A":
					// Promt for a digit in certain amount
					System.out.print("Enter a quantity in pounds: ");
					stdin = new Scanner(System.in);
					// Store input into variable
					userInput = stdin.nextDouble();
					// Print converted to and the amount
					System.out.printf("Kilograms are: %.2f", poundsToKilos(userInput));
					break;
				case "B":
					System.out.print("Enter a quantity in kilos: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					System.out.printf("Pounds are: %.2f", kilosToPounds(userInput));
					break;
				case "C":
					System.out.print("Enter a quantity in kilometers: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					System.out.printf("Miles are: %.2f", kmToM(userInput));
					break;
				case "D":
					System.out.print("Enter a quantity in miles: ");
					stdin = new Scanner(System.in);
					userInput = stdin.nextDouble();
					System.out.printf("Kilometers are: %.2f", mToKm(userInput));
					break;
				}
			}
			catch (Exception ex)
			{
				System.out.print("That's not valid! Try again.");
			}
			// Skip a line 
			System.out.println("\n");
		}while(!(userCommand.equals("E")));
	}
}
