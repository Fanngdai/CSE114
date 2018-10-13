import java.util.Scanner;

/*
 * Lab 3 part 2
 * Promt user to enter a month and year. With the given information, the 
 * program will inform the user how many days are in that month and year.
 */
public class DaysInMonth {
	public static boolean isLeapYear(int year)
	{
		// Not a leap year. Return false no need to go on.
		if(year%4 != 0)
			return false;
		if(year%100==0 && year%400!=0)
			return false;
		else return true;
	}

	public static void main(String[] args)
	{
		// Used to store user input
		int month, year;

		try
		{
			// Ask for month and store in variable
			System.out.print("Enter month: ");
			Scanner stdin = new Scanner(System.in);
			month = stdin.nextInt();

			// Ask for year and store in variable
			System.out.print("Enter year: ");
			stdin = new Scanner(System.in);
			year = stdin.nextInt();

			switch(month)
			{
			case 1:
				System.out.print("Janurary " + year + " has 31 days!");
				break;
			case 2:
				if(isLeapYear(year))
					System.out.print("February " + year + " has 29 days!");
				else System.out.print("February " + year + " has 28 days!");
				break;
			case 3:
				System.out.print("March " + year + " has 31 days!");
				break;
			case 4:
				System.out.print("April " + year + " has 30 days!");
				break;
			case 5:
				System.out.print("May " + year + " has 31 days!");
				break;
			case 6:
				System.out.print("June " + year + " has 30 days!");
				break;
			case 7:
				System.out.print("July " + year + " has 31 days!");
				break;
			case 8:
				System.out.print("August " + year + " has 31 days!");
				break;
			case 9:
				System.out.print("September " + year + " has 30 days!");
				break;
			case 10:
				System.out.print("October " + year + " has 31 days!");
				break;
			case 11:
				System.out.print("November " + year + " has 30 days!");
				break;
			case 12:
				System.out.print("December " + year + " has 31 days!");
				break;
			}
		}
		catch (Exception ex)
		{
			System.out.print("What you entered is not valid! Good-bye!");
			System.exit(0);
		}
	}
}
