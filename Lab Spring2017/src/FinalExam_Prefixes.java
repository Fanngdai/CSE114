/*
Given HELLOWORLD
Print this
H
HE
HEL
HELL
HELLO
HELLOW
HELLOWO
HELLOWOR
WELLOWORL
HELLOWORLD

2 Questions. One for loop another with recursion
 */
public class FinalExam_Prefixes {
	public static void main(String[] args){
		prefix("HELLOWORLD");
		prefixRec("HELLOWORLD");
	}
	public static void prefix(String word){
		for(int i=1; i<=word.length(); i++){
			System.out.println(word.substring(0,i));
		}
	}
	public static void prefixRec(String word){
		prefixRec(1, word);
	}
	public static void prefixRec(int i, String word){
		if(i==word.length()+1) return;
		System.out.println(word.substring(0,i));
		prefixRec(++i, word);
	}
}