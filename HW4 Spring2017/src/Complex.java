/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #4
 * Part 3: Complex.java class
 */
public class Complex {
	// Real part of complex number
	private double a;
	// Imaginary part of complex number
	private double b;

	// Creates a Complex object for number 0
	public Complex(){
		this.a = 0;
		this.b = 0;
	}
	// Creates a complex object with 0 for b
	public Complex(double a){
		this.a = 0;
	}
	public Complex(double a, double b){
		this.a = a;
		this.b = b;
	}

	public double getRealPart(){
		return a;
	}
	public double getImaginaryPart(){
		return b;
	}

	// a + bi + c + di = (a + c) + (b + d)i
	public String addition(Complex complexNumber){
		return toString(a + complexNumber.getRealPart(), b + complexNumber.getImaginaryPart());
	}
	// a + bi - (c + di) = (a - c) + (b - d)i
	public String subtraction(Complex complexNumber){
		return toString(a - complexNumber.getRealPart(), b - complexNumber.getImaginaryPart());
	}
	// (a + bi)*(c + di) = (ac - bd) + (bc + ad)i
	public String multiplication(Complex complexNumber){
		return toString(a * complexNumber.getRealPart() - b * complexNumber.getImaginaryPart()
				, b * complexNumber.getRealPart() + a * complexNumber.getImaginaryPart());
	}
	// (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc - ad)i/(c^2 + d^2)
	public String division(Complex complexNumber){
		return toString((a * complexNumber.getRealPart() + b * complexNumber.getImaginaryPart())
				/ (Math.pow(complexNumber.getRealPart(), 2) + Math.pow(complexNumber.getImaginaryPart(), 2))
				, (b * complexNumber.getRealPart() - a * complexNumber.getImaginaryPart())
				/ (Math.pow(complexNumber.getRealPart(), 2) + Math.pow(complexNumber.getImaginaryPart(), 2)));
	}

	// Returns (a + bi) as a string
	public String toString(double a, double b){
		if (b==0)
			return a + "";
		else
			return "(" + a + " + " + b + "i)";
	}
}
