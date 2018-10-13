/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #4
 * Part 1: MyInteger.java class
 * Test class called TestMyInteger
 * 
 * Class contains methods which will determine if a given int, type MyInteger value,
 * or a given MyInteger object is even, odd and prime. It will determine if value, the
 * integer declared in MyInteger class is equal to the given integer. It will also
 * determine if a given type of MyInteger is equal to the integer given. Lastly, It
 * contains a method called intParse that turns an given String integers into an int.
 */

public class MyInteger {
	// stores the value represented by this object
	private int value;

	// Constructor that sets an int to value
	public MyInteger(int value){
		this.value = value;
	}

	// Accessor
	public int getValue(){
		return value;
	}

	// Method checks if value is even
	public boolean isEven(){
		if(value%2!=0) 
			return false;
		else 
			return true;
	}
	// Method checks if by value is odd
	public boolean isOdd(){
		if(value%2==0) 
			return false;
		else 
			return true;
	}
	// Method checks if passed by value is prime
	public boolean isPrime(){
		if(value == 1)
			return false;
		for(int i=2; i<value; i++){
			if(value%i==0)
				return false;
		}
		return true;
	}

	// Method checks if passed by integer is even
	public static boolean isEven(int num){
		if(num%2!=0) 
			return false;
		else 
			return true;
	}
	// Method checks if passed by integer is odd
	public static boolean isOdd(int num){
		if(num%2==0) 
			return false;
		else 
			return true;
	}
	// Method checks if passed by integer is prime
	public static boolean isPrime(int num){
		if(num == 1)
			return false;
		for(int i=2; i<num; i++){
			if(num%i==0)
				return false;
		}
		return true;
	}

	// Method checks if passed by value is even
	public static boolean isEven(MyInteger num){
		if(num.getValue()%2!=0)
			return false;
		else return true;
	}
	// Method checks if passed by value is odd
	public static boolean isOdd(MyInteger num){
		if(num.getValue()%2==0) 
			return false;
		else 
			return true;
	}
	// Method checks if passed by value is prime
	public static boolean isPrime(MyInteger num){
		if(num.getValue() == 1)
			return false;
		for(int i=2; i<num.getValue(); i++){
			if(num.getValue()%i==0)
				return false;
		}
		return true;
	}

	// Method checks if passed by integer is equal to the value
	public boolean equals(int num){
		if(num!=value)
			return false;
		else 
			return true;
	}

	// Method checks if passed by integer is equal to the value
	public boolean equals(MyInteger num){
		if(num.getValue()!=value)
			return false;
		else 
			return true;
	}

	// Method converts the string value to int
	public static int parseInt(String word){
		int num = (int)word.charAt(0)-48;
		for(int i=1; i<word.length(); i++){
			num = num*10+((int)word.charAt(i)-48);
		}
		return num;
	}
}