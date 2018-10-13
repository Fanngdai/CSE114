/*
 * Write a program that checks whether a word is a palindrome. 
 * A palindrome is a set of values that is the same as its reverse. 
 * For example, “eye” is a palindrome, “ear” is not.
 */
public class Lab24_3 {
	public static void main(String[] args){
		System.out.println(isPalindrome("euiua"));
	}
	public static boolean isPalindrome(String a){
		if(a.length() == 1)
			return true;
		if(a.charAt(0) == a.charAt(a.length()-1))
			return isPalindrome(a.substring(1, a.length()-1));
		return false;
	}
}
