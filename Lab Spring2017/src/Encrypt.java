/*
 * Self practice for midterm 1
 * Program will ask user for an string. All letters of string will change to 2 letters ahead.
 * So a would become c. y would become a and z would become b.
 */
public class Encrypt {
	public static String encrypt(String a){
		String answer="";

		for(int i=0; i<a.length(); i++){
			if(a.charAt(i)!='y' && a.charAt(i)!='z')
				answer += (char)(a.charAt(i)+2);
			else if(a.charAt(i)=='y')
				answer += 'a';
			else if(a.charAt(i)=='z')
				answer += 'b';
		}
		return answer;
	}
	public static void main(String[] args){
		// Prints cdefghzab
		System.out.println(encrypt("abcdefxyz"));
		// Prints ucorngvgzv
		System.out.println(encrypt("sampletext"));
	}
}