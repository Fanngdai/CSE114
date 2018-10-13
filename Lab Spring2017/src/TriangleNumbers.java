import java.util.Scanner;

/*
 * Practice for midterm 1
 * 
 * Given a certain number suppose 10
 * program will print
 * 1
 * 3, 6, 10
 * 15, 21, 28, 36, 45, 55
 * So that each value is the nth digit printed plus the digit before that.
 * So 55 is the 10th digit printed. and the nth-1 place is 9th which is 45.
 * 45 + 10 = 55. And that is printed.
 * Yet, for every row, the nth digit = the amount of values to print.
 */
public class TriangleNumbers {
	public static int genNum(int num){
		return num*(num+1)/2;
	}

	public static void main(String[] args){
		int userInput;
		int count = 1;
		int end;

		// Promt user to enter an integer and store userInput
		System.out.print("Enter an integer: ");
		Scanner stdin = new Scanner(System.in);
		userInput = stdin.nextInt();

		end = genNum(userInput);

		for(int i=1; i<userInput; i++){
			// Prints the row
			for(int j=1; j<=genNum(i); j++){	
				if(end < genNum(count)) break;

				System.out.print(genNum(count));

				if(j==genNum(i))
					System.out.println();
				else if (end == genNum(count));
				else
					System.out.print(", ");
				count++;
			}
		}
	}
}