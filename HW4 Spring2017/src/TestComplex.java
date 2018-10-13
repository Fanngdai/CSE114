/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #4
 * Part 3: Complex.java class
 *
 * Class tests the methods of Complex class.
 *
 * https://www.symbolab.com/solver/complex-numbers-calculator/%5Cfrac%7B%5Cleft(2%2B5i%5Cright)%7D%7B%5Cleft(4-3i%5Cright)%7D
 */
public class TestComplex {
	public static void main(String[] args){
		Complex complex1 = new Complex(2,5);
		Complex complex2 = new Complex(4,-3);

		System.out.println(complex1.addition(complex2));
		System.out.println(complex1.subtraction(complex2));
		System.out.println(complex1.multiplication(complex2));
		System.out.println(complex1.division(complex2));
	}
}
