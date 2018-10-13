/*
 * (Occurrences of a specified character in an array of characters) Write a method using loops that finds the number of occurrences of a specified character in an array.
 * public static int count(char[] chars, char ch){...}
 * You should use a helper method:
 * public static int count(char[] chars, char ch, int high){...} 
 */
public class Lab24_1{

	public static void main(String[] args){
		char[] ch = new char[5];
		ch[0] = 'H';
		ch[1] = 'E';
		ch[2] = 'L';
		ch[3] = 'L';
		ch[4] = 'O';

		System.out.println(count(ch, 'L'));
	}
	
	public static int count(char[] chars, char ch) {
		return count(chars, ch, chars.length - 1);
	}

	public static int count(char[] chars, char ch, int high) {
		int count = 0;
		if (chars[high] == ch) 
			count = 1;
		else 
			count = 0;
		if (high == 0)
			return count;
		else
			return count + count(chars, ch, high - 1);
	}
}
