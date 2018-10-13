/*
 * Practice for midterm 1
 * Some codes that may be useful to look at in the future
 * 
 * reverse method reverses the string given.
 * 
 * triangle: accepts an integer and prints a pattern.
 * So given 9,
 * it will print
 * 12345678987654321
 * 	234567898765432
 *   3456789876543
 *    45678987654
 *     567898765
 *      6789876
 *       78987
 *        898
 *         9
 *
 * Given an integer, program will print an hour glass. If the 
 * given integer,num, is odd, there will be num amount of rows
 * and col. If num is even, there will be num-1 amount of rows
 * and num col.
 * 
 * Given an array, and a digit, value in array will shift left
 * that amount of times
 */
public class Midterm1 {
	// reverse a string
	public static void reverse(String a){
		String answer="";
		for(int i=a.length()-1; i>=0; i--){
			answer += a.charAt(i);
		}
		System.out.print(answer);
		System.out.println();
	}
	
	public static String reverse2(String a){
		if(a.length()==1) return a;
		return a.substring(a.length()-1,a.length()) + reverse2(a.substring(0,a.length()-1));
	}

	// prints triangle
	public static void triangle(int num){
		for(int row=1; row<=num; row++){

			for(int col=1; col<=num; col++){
				if(row>col){
					System.out.print(" ");
				}
			}

			for(int col=1; col<=num; col++){
				if(row<=col)
					System.out.print(col);
			}

			for(int col=num-1; col>=0; col--){
				if(row<=col)
					System.out.print(col);
			}
			System.out.println();
		}
	}

	// prints triangle from 1-#-1
	public static void triangle2(int num){
		for(int row=1; row<=num; row++){

			for(int col=1; col<=num; col++){
				if(row>col){
					System.out.print(" ");
				}
			}

			for(int col=1; col<=num; col++){
				if(row<=col)
					System.out.print(Math.abs(col-row)+1);
			}

			for(int col=num-1; col>=0; col--){
				if(row<=col)
					System.out.print(Math.abs(col-row)+1);
			}
			System.out.println();
		}
	}

	// Prints hour glass shape
	public static void printHourGlass(int num){

		// Construct the rows and columns
		for(int row=0; row<num; row++){
			for(int col=0; col<num; col++){
				// To obtain odd amount of rows, we delete one
				if(num%2==0 && (num-1)/2==row && row==col){
					if(row==col) System.out.print("**");
					// Skips a row. To delete
					row++;
					break;
				}
				// first row
				if(row == 0) System.out.print("*");
				// last row
				else if(row == num-1) System.out.print("*");
				// Diagonal top left to bottom right
				else if(row==col) System.out.print("*");
				// Diagonal top right to bottom left
				else if(row+col==num-1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	// 
	public static void shift(int[] num,int move){
		int count=0;
		int temp;
		while(count < move){
			count++;
			temp = num[0];
			for(int i=0; i<num.length-1; i++){
				num[i] = num[i+1];
			}
			num[num.length-1] = temp;
		}
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+" ");
		}
	}

	public static void main(String[] args){
		//.god yzal eht revo spmuj xof nworb kciuq ehT
		reverse("The quick brown fox jumps over the lazy dog.");
		System.out.println();
		System.out.println(reverse2("The quick brown fox jumps over the lazy dog."));

		// Prints pattern
		triangle(9);
		System.out.println();
		
		triangle2(9);
		System.out.println();

		// Prints hour glass the size of
		printHourGlass(4);
		printHourGlass(5);
		printHourGlass(6);
		printHourGlass(14);
		
		int[] num = {1,2,3,4,5,6,7};
		shift(num,3);
	}
}
