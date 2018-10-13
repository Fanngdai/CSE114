
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		String s = new Scanner(System.in).next();
		displayPermutation(s);
	}

	public static void displayPermutation(String s) {
		displayPermutation("", s);
	}

	public static void displayPermutation(String s1, String s2) {
		// if (s2.equals("")){
		if (s2.length() == 0) {
			System.out.println(s1);
		} 
		else {
			for (int i = 0; i < s2.length(); i++) {
				displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
			}
		}
	}
}

//public class Permutations {
//
//    // print n! permutation of the characters of the string s (in order)
//    public  static void perm1(String s) { perm1("", s); }
//    private static void perm1(String prefix, String s) {
//        int n = s.length();
//        if (n == 0) StdOut.println(prefix);
//        else {
//            for (int i = 0; i < n; i++)
//               perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
//        }
//
//    }
//
//    // print n! permutation of the elements of array a (not in order)
//    public static void perm2(String s) {
//        int n = s.length();
//        char[] a = new char[n];
//        for (int i = 0; i < n; i++)
//            a[i] = s.charAt(i);
//        perm2(a, n);
//    }
//
//    private static void perm2(char[] a, int n) {
//        if (n == 1) {
//            StdOut.println(a);
//            return;
//        }
//        for (int i = 0; i < n; i++) {
//            swap(a, i, n-1);
//            perm2(a, n-1);
//            swap(a, i, n-1);
//        }
//    }  
//
//    // swap the characters at indices i and j
//    private static void swap(char[] a, int i, int j) {
//        char c = a[i];
//        a[i] = a[j];
//        a[j] = c;
//    }
//
//
//
//    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String elements = alphabet.substring(0, n);
//        perm1(elements);
//        StdOut.println();
//        perm2(elements);
//    }
//}