/*
 * Lab 13 part 1
 */
public class MyString1 {
	private char[] chars;

	public MyString1(char[] chars){
		// Make the length of s the same as length of chars
		this.chars = new char[chars.length];
		for(int i=0; i<chars.length; i++)
			this.chars[i] = chars[i];
	}
	// returns the character at specific index
	public char charAt(int index){
		return this.chars[index];
	}
	// return the length of the String
	public int length(){
		return this.chars.length;
	}
	public MyString1 substring(int begin, int end){
		char [] part = new char[end-begin];

		for(int i=0; i<part.length; i++){
			part[i] = this.charAt(i+begin);
		}
		return new MyString1(part);
	}
	public MyString1 toLowerCase(){
		for(int i=0; i<this.length(); i++){
			if(chars[i]>=65 && chars[i]<=90)
				this.chars[i] = (char) (chars[i]+32);
			else
				this.chars[i] = chars[i];
		}
		return new MyString1(chars);
	}
	public boolean equals(MyString1 s){
		//		return ( s != null
		//				&& getClass() == s.getClass()
		//				&& chars.equals((s).chars));

		if(chars.length != s.length())
			return false;
		for(int i=0; i<chars.length; i++)
			if(chars[i] != s.charAt(i)){ 
				return false;
			}
		return true;
	}
	public static MyString1 valueOf(int i){
		// The amount of digits
		int count = 0;
		int temp = i;
		while(temp!=0){
			temp /= 10;
			count++;
		}
		char[] word = new char[count];
		// Add each character in backwards
		for(int j=count-1; j>=0; j--){
			// 48 ascii = '0'
			word[j] = (char) (48+i%10);
			i/=10;
		}
		return new MyString1(word);
	}
	
//	public MyString1[] split(String s){
//		for(int i=0; i<chars.length; i++){
//			if(chars[i] == s.substring(i, s.length())
//					;
//		}
//	}

	// Need this in order to print instead of address
	public String toString(){
		String word = "";
		for(int i=0; i<chars.length; i++){
			word += chars[i];
		}
		return word;
	}

	public static void main(String[] args){
		char[] tempWord = {'A','B','C','D','E','f','g','h','i','j','1','2','3'};
		char[] tempWord2 = {'A','B','C','D','E','f','g','h','i','j','1','2','3'};
		char[] tempWord3 = {'A','B','A','D','A','f','A','h','A','j'};
		MyString1 word = new MyString1(tempWord);
		MyString1 word2 = new MyString1(tempWord2);
		MyString1 word3 = new MyString1(tempWord3);
		// Prints C
		System.out.println(word.charAt(2));
		// 13
		System.out.println(word.length());
		// Prints CDEf
		System.out.println(word.substring(2,6));
		// Prints abcdefghij123
		System.out.println(word.equals(word2)? "correct" : "wrong");
		System.out.println(word.equals(word3)? "wrong" : "correct");
		System.out.println(word.toLowerCase());

		String testingWord = MyString1.valueOf(12345).toString();
		System.out.println(testingWord);
	}
}