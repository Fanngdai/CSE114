/*
 * Name:
 * ID:
 * Section:
 * Email:
 * Part 2
 * 
 * Explanation:
 * Display calendar for entire year.
 */
import java.util.Scanner;

public class Calendar {
	// Checks for leap year or not
	public static boolean isLeapYear(int year)
	{
		if(year % 4 != 0 && year%100!=0)
			return false;
		else if (year%100==0 && year%400!=0)
			return false;
		else return true;
	}

	// Given the first date of a month and the month, method will print the entire month
	public static void printMonth(int firstDay,int numDays)
	{	
		int count = 0;

		System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
		System.out.println("--  --  --  --  --  --  --");

		// Places spaces if no date is there
		for(int i=0; i<firstDay; i++)
		{
			if(i==firstDay-1)
			{
				System.out.print("   ");
				count ++;
				break;
			}
			System.out.print("    ");
			count ++;
		}

		// Prints the dates
		for(int j=0; j<numDays; j++)
		{
			if(count==7)
			{
				count = 0;
				System.out.println();
			}
			if(count!=0)
			{
				// Put a space before single digit dates
				if(j<9) System.out.print("  ");
				else System.out.print(" ");
			}
			else if(count==0 && j<9)
			{
				System.out.print(" ");
			}
			// Print the day
			System.out.print(j+1 + " ");
			count++;
		}
		System.out.println();
	}

	// Determine which day the next month will start on
	public static int firstDayOfNextMonth(int firstDay,int numDays)
	{
		return (firstDay+numDays)%7;
	}

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int year;
		int lastTwoDigitOfYear;
		int century;
		int numDays = 0;
		int firstDay;

		System.out.print("Enter Year: ");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		lastTwoDigitOfYear = year % 100;
		century = ((year/100) + 1)%7;
		// Century number. Found on wikipedia.
		switch (century)
		{
		case 0:
			century = 5;
			break;
		case 1:
			century = 4;
			break;
		case 2:
			century = 3;
			break;
		case 3:
			century = 2;
			break;
		case 4:
			century = 1;
			break;
		case 5:
			century = 0;
			break;
		case 6:
			century = 6;
			break;
		}

		// figure out the week of January 1st given the year
		// Sun=0, Mon=1, Tues=2, Wed=3, Thur=4, Fri=5, Sat=6
		if (isLeapYear(year))
			firstDay = (int)((1+lastTwoDigitOfYear + Math.floor(lastTwoDigitOfYear/4) + century) % 7);
		else
			firstDay = (int)((2+lastTwoDigitOfYear + Math.floor(lastTwoDigitOfYear/4) + century) % 7);
		
		for(int month=1; month<13; month++)
		{		
				firstDay = firstDayOfNextMonth(firstDay,numDays);

			switch(month)
			{
			case 1:
				System.out.println("\t Janurary ");
				numDays=31;
				break;
			case 2:
				System.out.println("\t Feburary ");
				if (isLeapYear(year))
					numDays = 29;
				else 
					numDays = 28;
				break;
			case 3:
				System.out.println("\t  March ");
				numDays=31;
				break;
			case 4:
				System.out.println("\t  April ");
				numDays=30;
				break;
			case 5:
				System.out.println("\t   May ");
				numDays=31;
				break;
			case 6:
				System.out.println("\t   June ");
				numDays=30;
				break;
			case 7:
				System.out.println("\t   July ");
				numDays=31;
				break;
			case 8:
				System.out.println("\t  August ");
				numDays=31;
				break;
			case 9:
				System.out.println("\t September ");
				numDays=30;
				break;
			case 10:
				System.out.println("\t October ");
				numDays=31;
				break;
			case 11:
				System.out.println("\t November ");
				numDays=30;
				break;
			case 12:
				System.out.println("\t December ");
				numDays=31;
				break;
			}

			if(month==1)
				printMonth(firstDay, numDays);
			else
			{
				printMonth(firstDay, numDays);
			}

			System.out.println();
		}
	}
}