/*
 * This class will take a number and decide
 * the month and day which this number is 
 * associated with. 
 * It will take a number, if it is within the
 * days the month has, it will return the month 
 * and the number. The number is the date.
 * If it is not, it will subtract the days the 
 * month has and move on the to the next month.
 * Repeat until it is december which it will just
 * return December and the remaining amount.
 * 
 * The second part which I commented out.
 * Another version of the same program. Using an array, 
 * we will set it to the dates of which the dates are
 * supposed to be. If the dates are within the 2 arrays, 
 * we will subtract the given number by the smaller array 
 * and return accroding to the location of the array.
 */

public class DayConversion
{
	// Given a number from 1-366, and a bool, determine the month and date
	public static String Convertor(int dayOfYear, boolean isLeapYear)
	{	
		// If the date is Janurary, return it. Else, subtract 31 (the day in this month)
		if(dayOfYear <= 31)
		{
			return "Janurary " + dayOfYear;
		}
		else dayOfYear -= 31;

		// We will land on Feburary. There are two cases in Feburary.
		// If it is a leap year, it has 29 days. If it is not, 28 days.

		// Not a leap year and is in Feburary
		if(isLeapYear == false && dayOfYear <= 28)
		{
			return "Febuary " + dayOfYear;
		}
		else if(isLeapYear == false)
		{
			dayOfYear -= 28;
		}

		// Is a leap year and is in Feburary
		if(isLeapYear == true && dayOfYear <= 29)
		{
			return "Febuary " + dayOfYear;
		}
		else if(isLeapYear == true)
		{
			dayOfYear -= 29;
		}

		if(dayOfYear <= 31)
		{
			return "March " + dayOfYear;
		}
		else dayOfYear -= 31;

		if(dayOfYear <= 30)
		{
			return "April " + dayOfYear;
		}
		else dayOfYear -= 30;

		if(dayOfYear <= 31)
		{
			return "May " + dayOfYear;
		}
		else dayOfYear -= 31;

		if(dayOfYear <= 31)
		{
			return "June " + dayOfYear;
		}
		else dayOfYear -= 30;

		if(dayOfYear <= 31)
		{
			return "July " + dayOfYear;
		}
		else dayOfYear -= 31;

		if(dayOfYear <= 31)
		{
			return "August " + dayOfYear;
		}
		else dayOfYear -= 31;

		if(dayOfYear <= 30)
		{
			return "September " + dayOfYear;
		}
		else dayOfYear -= 30;

		if(dayOfYear <= 31)
		{
			return "October " + dayOfYear;
		}
		else dayOfYear -= 31;

		if(dayOfYear <= 30)
		{
			return "November " + dayOfYear;
		}
		else dayOfYear -= 30;

		return "December " + dayOfYear;
	}

	/*
	public static String Convertor(int dayOfYear, boolean isLeapYear)
	{	
		String monthToReturn = "Error";
		int dayToReturn = 0;
		// 365 days in a year (Not a leap year)
		int[] date ={0,31,59,90,120,151,181,212,243,273,304,334,365};

		// If it is a leap year (366 days) add 1 day after feb
		if (isLeapYear == true)
		{
			for(int i= 2; i<=12; i++)
			{
				date[i]++;
			}
		}

		String[] month ={"Nothing", "Janurary", "Feburary", 
				"March", "April", "May", "June", "July", "August", 
				"September", "October", "November", "December"};

		for(int i=1; i<=12; i++)
		{
			if(dayOfYear>date[i-1] && dayOfYear<date[i])
			{
				return month[i] + " " + (dayOfYear - date[i-1]);
			}
		}

		return "Error";
	}
	 */
}
