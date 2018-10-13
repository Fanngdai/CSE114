/*
 * (Summing the digits in an integer using recursion) 
 * Write a recursive method that computes the sum of the 
 * digits in an integer.
 */
public class Lab24_4 {
	public static void main(String[] args){
		System.out.println(sumDigits(1111));
		System.out.println(reverse(543215872));
		System.out.println(reverse2(543215872));
	}
	
	public static int sumDigits(int n){
		int sum = 0;
		if(n == 0)
			return sum;
		else
			sum = n % 10 +sumDigits(n/10);
		return sum;
	}
	public static int reverse(int n){
		return reverse(n, String.valueOf(n).length());
	}
	
	public static int reverse(int n, int length){
		int reverseNum = 0;
		if(length == 1)
			return n;
		reverseNum = n%10;
		n = n/10;
		reverseNum = (int) ((reverseNum * Math.pow(10, length - 1)) + reverse(n, length - 1));
		return reverseNum;
	}
	
	public static int reverse2(int n){
		int length = lengthN(n);
		if(n<10) return n;
		return (int) (Math.pow(10, length-1) * reverse2(n%10) + reverse2(n/10));
	}
	
	public static int lengthN(int n){
		if(n<10) return 1;
		return 1 + lengthN(n/10);
	}
}