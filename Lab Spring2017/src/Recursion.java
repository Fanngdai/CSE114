/*
 * factorial recursion
 * fibonaci
 * 
 * Lab 23 part 1-4
 * 
 */
public class Recursion{
	public static int factorial(int n){
			int factorial = 1;
			for(int i=2; i<=n; i++)
				factorial *= i;
			return factorial;
	}
	
	public static int factorialR(int n){
		if(n<10) return n*factorial(n-1);
		return factorial(n/10);
	}
	
	public static int factorial2(int n){
		if(n<=1) return 1;
		return n* factorial(n-1);
	}
	
	public static int fibonaci(int n){
		if(n<=1) return n;
		return fibonaci(n-1)+fibonaci(n-2);
	}
	
	public static double m(int n){
		if(n<=1) return n;
		return( 1.0/n + m(n-1) );
	}
	
	public static void main(String[] args){
		System.out.println(factorial(6));
		System.out.println(factorialR(6));
		System.out.println(factorial2(6));
		System.out.println(fibonaci(10));
		// My programming lab. Also part 4 of lab
		System.out.println(m(5));
	}
}
