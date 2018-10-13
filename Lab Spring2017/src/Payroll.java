/*
 * Lab 4 part 2
 * This program ask user their name, the amount of hours they worked and the hourly pay.
 * With the given information, the program will calculate the gross pay which is the
 * amount they earned from their job without tax reduction. This program will use that
 * information to calculate the federal tax(20%) and state tax(20%) from the gross earning.
 * Lastly, this program will print the gross pay, federal tax, state tax and the net salary
 * which is the gross pay deducting the tax withholds.
 */

import java.util.Scanner;

public class Payroll {
	public static void main(String[] args)
	{
		double hourWork, hourPay, grossPay, federalTax, stateTax;
		String name;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.print("Employee's name: ");
		name = stdin.next();
		System.out.print("Number of hours worked in a week: ");
		hourWork = stdin.nextDouble();
		System.out.print("Hourly pay rate: ");
		hourPay = stdin.nextDouble();
		
		grossPay = hourWork * hourPay;
		System.out.println("Gross salary: " + grossPay);
		federalTax = hourWork * hourPay * .20;
		System.out.println("Federal tax withholding(20%): " + Math.floor(federalTax *100)/100);
		stateTax = hourWork * hourPay * .09;
		System.out.println("State tax witholding(9%): " + Math.floor(stateTax *100)/100);
		System.out.println("Net salary: " + (grossPay - federalTax - stateTax));
	}
}