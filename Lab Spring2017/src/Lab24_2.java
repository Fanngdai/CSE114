/*
 * (Finding the number of uppercase letters in a string) 
 * Write a method using loops to return the number of 
 * uppercase letters in a string.
 */
public class Lab24_2 {
	public static void main(String[] args){
		System.out.println(findUpperCase("TeStAbcD"));
	}
	public static int findUpperCase(String a){
		int count = 0;
		for(int i = 0; i < a.length(); i++){
			if (a.charAt(i)>= 65 && a.charAt(i)<=90)
				count++;
		}
		return count;
	}
}
