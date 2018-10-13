/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Temperature converters
 * Homework #2
 * Part 1
 *
 * 8 methods that converts
 * fahrenheit to Celsius		C = (F-32.0)*5/9
 * fahrenheit to Kelvin			K = F+459.67*5/9
 * fahrenheit to Rankine		R = F+459.67
 * celsius to Fahrenheit		F = C*9/5+32
 * celsius to Kelvin			K = C+273.15
 * celsius to Rankine			R = (C+273.15)*9/5
 * kelvin to Fahrenheit			F = K*9/5-459.67
 * kelvin to Celsius			C = K-273.15
 *
 * Converts from kelvin or celsius or fahrenheit or Rankine to another temperature.
 */

public class Temperatures {
	// method 1
	public static double fahrenheit2Celsius(double fahrenheit)
	{
		return (fahrenheit-32.0)*5/9;
	}

	// method 2
	public static double fahrenheit2Kelvin(double fahrenheit)
	{
		return fahrenheit+459.67*5/9;
	}

	// method 3
	public static double fahrenheit2Rankine(double fahrenheit)
	{
		return fahrenheit+459.67;
	}

	// method 4
	public static double celsius2Fahrenheit(double celsius)
	{
		return celsius*9/5+32.0;
	}

	// method 5
	public static double celsius2Kelvin(double celsius)
	{
		return (celsius+273.15);
	}

	// method 6
	public static double celsius2Rankine(double celsius)
	{
		return (celsius+273.15)*9/5;
	}

	// method 7
	public static double kelvin2Fahrenheit(double kelvin)
	{
		return (kelvin*9/5-459.67);
	}

	// method 8
	public static double kelvin2Celsius(double kelvin)
	{
		return (kelvin-273.15);
	}

	/*
	public static void main(String[] args)
	{

	}
	*/
}
