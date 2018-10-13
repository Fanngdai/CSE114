/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Basal Metabolic Rate
 * Homework #2
 * Part 4
 * 
 * Given the mass in pounds, height in inches, age, and the gender
 * of a person, this program will figure out the BMR of that
 * individual by the formula
 * 			BMR = 10m + 6.25h - 5a + s
 * For which	m is equal to the individuals mass in kilogram,
 * 				h is equal to the individuals height in centimeter,
 * 				a is equal to the individuals age, and
 * 				s is 5 for male and -161 for female.
 * 
 * The bmr method will convert the given pounds and inches to kilogram
 * and centimeter. Then, using the formula above, it will figure out the
 * bmr of that individual.
 */

public class BMR {
	public static double bmr(double pounds, double inches, int age, char gender)
	{
		// Used to store the persons weight and height after conversion
		double kilogram, centimeter;
		// Convert the individuals weight from pound to kilogram
		kilogram = pounds*0.453592;
		// Convert the individuals height from inches to centimeter
		centimeter = inches*2.54;
		
		if(gender == 'F' || gender == 'f')
		{
			return (10*kilogram+6.25*centimeter-5*age-161);
		}
		else return (10*kilogram+6.25*centimeter-5*age+5);
	}
	/*
	public static void main(String[] args)
	{	
		// prints 1367.4196 
		System.out.println(bmr(130, 66, 55, 'm') );
		// prints 1201.4196
		System.out.print(bmr(130, 66, 55, 'f') );
	}
	*/
}