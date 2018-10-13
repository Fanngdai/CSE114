/*
 * Fanng Dai
 * sbuid
 * CSE114 L12
 * Homework #1
 * Part 1
 *
 * Prints my full name and my Stony ID number. It will print the weekdays of which I have school.
 * In a graph format, weekday displaying in a column and time displaying in a row, it will fill
 * out the graph with my schedule of Spring 2017 at Stony Brook. Each class will align with the
 * weekday I have it and the times I have it.
 */

public class Schedule
{
	public static void main(String[] args)
	{
		for(int i = 0; i<20; i++)
		System.out.println(i);

		// Prints First and Last Name
		System.out.println("Fanng Dai");
		// Prints Stony ID
		System.out.println("sbuid");
		// Prints the weekdays
		System.out.println("                    Monday    Tuesday   Wednesday Thursday  Friday ");
		// Prints Schedule
		System.out.println("8:30 am - 9:50 am                                                  ");
		System.out.println("10:00am - 10:53am   AMS 301   CHI120    AMS 301   CHI120    AMS 301");
		System.out.println("10:53am - 11:00am             CHI120              CHI120           ");
		System.out.println("11:00am - 11:20am   CSE 114   CHI120    CSE114    CHI120    CSE114 ");
		System.out.println("11:20am - 11:30am   CSE 114             CSE114              CSE114 ");
		System.out.println("11:30am - 11:53am   CSE 114             CSE114    CHI120    CSE114 ");
		System.out.println("11:53am - 12:23pm                                 CHI120           ");
		System.out.println("1:00 pm - 2:20 pm   AMS310                                  AMS310 ");
		System.out.println("2:30 pm - 3:50 pm   AMS 301   CSE114    CSE215    CSE114           ");
		System.out.println("2:30 pm - 3:50 pm                                 CSE215           ");
		// After you print, exit the program
		System.exit(0);
	}
}
