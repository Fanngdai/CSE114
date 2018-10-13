import java.util.Scanner;

/*
 * Summer2017 Lab
 * 
 * (Math: combinations) Write a program that prompts the user to enter 10 integers 
 * and displays all combinations of picking two numbers from the 10.
 */
public class Lab6_3_Summer2017 {
	public static void main(String[] args){
		// To store users 
		int[] num = new int[10];
		Scanner stdin = new Scanner(System.in);
		System.out.println("Please enter 10 integers");
		// Store user input into 
		for(int i=0; i<10; i++){
			num[i] = stdin.nextInt();
		}
		
		// Print all combinations
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.println(num[i] + "\t" + num[j]);
			}
		}
	}
}