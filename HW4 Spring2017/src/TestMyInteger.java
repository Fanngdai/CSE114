/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #4
 * Part 1: TestMyInteger.java class
 *
 * Class tests the methods of MyInteger class.
 *
 * Static belongs to the class
 */
public class TestMyInteger {
	public static void main(String[] args){
		MyInteger myInt = new MyInteger(2047);

		if(myInt.isEven())
			System.out.println(myInt.getValue() + " is even.");
		else
			System.out.println(myInt.getValue() + " is not even.");

		if(MyInteger.isEven(myInt))
			System.out.println(myInt.getValue() + " is even.");
		else
			System.out.println(myInt.getValue() + " is not even.");

		if(myInt.isOdd())
			System.out.println(myInt.getValue() + " is odd.");
		else
			System.out.println(myInt.getValue() + " is not odd.");

		if(MyInteger.isOdd(myInt))
			System.out.println(myInt.getValue() + " is odd.");
		else
			System.out.println(myInt.getValue() + " is not odd.");

		if(myInt.isPrime())
			System.out.println(myInt.getValue() + " is prime.");
		else
			System.out.println(myInt.getValue() + " is not prime.");

		if(MyInteger.isPrime(myInt))
			System.out.println(myInt.getValue() + " is prime.");
		else
			System.out.println(myInt.getValue() + " is not prime.");



		if(MyInteger.isEven(2047))
			System.out.println("2047 is even. uhh wrong...");
		else
			System.out.println("2047 is odd.");

		if(MyInteger.isEven(2048))
			System.out.println("2048 is even.");
		else
			System.out.println("2048 is odd. uhh wrong...");

		if(MyInteger.isOdd(2047))
			System.out.println("2047 is odd.");
		else
			System.out.println("2047 is even. uhh wrong...");

		if(MyInteger.isOdd(2048))
			System.out.println("2048 is odd. uhh wrong...");
		else
			System.out.println("2048 is even.");

		if(MyInteger.isPrime(2047))
			System.out.println("2047 is prime. uhh wrong...");
		else
			System.out.println("2047 is not prime.");

		if(MyInteger.isPrime(127))
			System.out.println("127 is prime.");
		else
			System.out.println("127 is not prime. uhh wrong...");



		if(myInt.equals(2047))
			System.out.println(myInt.getValue() + " is the same as 2047.");
		else
			System.out.println(myInt.getValue() + " is not the same as 2047.");

		if(myInt.equals(2048))
			System.out.println(myInt.getValue() + " is the same as 2048.");
		else
			System.out.println(myInt.getValue() + " is not the same as 2048.");

		if(myInt.equals(myInt))
			System.out.println(myInt.getValue() + " is the same as 2047.");
		else
			System.out.println(myInt.getValue() + " is not the same as 2047.");

		int x = MyInteger.parseInt("12345");
		System.out.print(x);
	}
}
