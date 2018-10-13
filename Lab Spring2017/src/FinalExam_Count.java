/*
Given an positive integer, count the amount of digits in it.
Ex. Given 3278, your answer should be 4
 */
public class FinalExam_Count {
	public static void main(String[] args){
		System.out.print(count(3278));
		int c=0;
		int n=3278;
//		for(int h=0;h>-1;h++){
//			c++;
//			n=n/10;
//			if(n==0){
//				h=-2;
//			}
//		}
//		System.out.print(c);
		
		n = 100;
		int count = 0;
		while(n>0){
			count++;
			n/=10;
		}
		System.out.print(count);
	}
	
	
	
	
	public static int count(int num){
		if(num<10) return 1;
		return 1 + count(num/10);
	}
}