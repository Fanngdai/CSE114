/*
 *  Name:
 *  ID:
 *  Section:
 *  Email:
 * 
 * Explanation:
 *  Program will calculate the taxes an individual will pay according to their 
 *  salary, amount of children, age, martial status, and the amount already paid.
 */
import java.util.Scanner;

public class Tax {

	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int annualSalary, children=0, age, taxesPaid;
		String relationshipStatus;
		int ageDeduction, relationshipDeduction = 0, totalTaxable, totalTax=0;
		int printAgeDeduction;

		System.out.println("IT'S TAX TIME!");

		System.out.println("Please enter your annual salary:");
		Scanner annualSalaryInput = new Scanner(System.in);
		annualSalary = annualSalaryInput.nextInt();

		// Asks for amount of children and calculates the deducted amount
		System.out.println("Please enter the number of children you have:");
		Scanner childrenInput = new Scanner(System.in);
		children = childrenInput.nextInt();
		children *= 2000;

		System.out.println("Please enter your age:");
		Scanner ageInput = new Scanner(System.in);
		age = ageInput.nextInt();

		// Asks for relationship status. If entered is NOT S or M, exit the program
		System.out.println("Please enter your relationship status (S = single, M = married):");
		Scanner relationshipStatusInput = new Scanner(System.in);
		relationshipStatus = relationshipStatusInput.next();

		if(relationshipStatus.equals("M")==false && relationshipStatus.equals("S")==false)
			System.exit(0);

		System.out.println("Please input the amount of taxes already paid:");
		Scanner taxesPaidInput = new Scanner(System.in);
		taxesPaid = taxesPaidInput.nextInt();

		System.out.println("PROCESSING...");

		// Determines the amount to deduct by age
		if (age<=17)
		{
			ageDeduction = (int)((annualSalary - children) * .75);
			printAgeDeduction = ageDeduction;
		}
		else if (age>=65)
		{
			ageDeduction = (int)((annualSalary - children) * .5);
			printAgeDeduction = ageDeduction;
		}
		else
		{
			ageDeduction = (annualSalary - children);
			printAgeDeduction = 0;
		}

		// How much should be deducted by relationship status
		if(relationshipStatus.equals("M"))
			relationshipDeduction = 750;
		else if (relationshipStatus.equals("S"))
			relationshipDeduction = 500;

		totalTaxable = ageDeduction - relationshipDeduction;

		if(totalTaxable<10000)
		{
			totalTax = (int)(totalTaxable*.18);
		}
		else if(totalTaxable<=50000)
		{
			totalTax = (int)((10000*.18) + ((totalTaxable-10000)*.31));
		}
		else if(totalTaxable>50000)
		{
			totalTax = (int)((10000*.18) + ((totalTaxable-10000)*.31) + ((totalTaxable-50000) * .40));
		}

		System.out.println("Annual Salary:\t\t" + annualSalary);
		System.out.println("Deduction Children:\t"+ children);
		System.out.println("Deduction Age:\t\t" + printAgeDeduction);
		System.out.println("Deduction Status:\t" + relationshipDeduction);
		System.out.println("Total Taxable Income:\t" + (totalTaxable));
		System.out.println("Total Taxes:\t\t" + totalTax);
		System.out.println("Net Income:\t\t" + (annualSalary - totalTax));
		System.out.println("Total Taxes Paid:\t" + taxesPaid);
		System.out.println("Total Taxes Due:\t" + (totalTax - taxesPaid));
	}
}
