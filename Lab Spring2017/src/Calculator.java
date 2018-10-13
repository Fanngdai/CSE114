/*
 * Lab 17 part 1
 * Exception
 */
public class Calculator {
	public static void main(String[] args) throws Exception{
		int a = 12;
		int b = 0;
		if(b==0){
			throw new NumberFormatException("Division by zero is illegal");
		}
		System.out.print(a/b);
//		try{
//			System.out.print(a/b);
//		}
//		catch(Exception ex){
//			System.out.print("Division by zero is illegal");
//		}
	}
}