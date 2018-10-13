/*
 * Final Review
 * All numbers are multiplied by 2 starting with 1.
 * At a certain point, you will add all numbers before that with n amt.
 */
public class Final {
	public static void main(String[] args){
		// Constructs an array such that it starts with 1 and doubles each time. (64 boxes)
		int[] arr = new int[64];
		int num = 1;
		for(int i=0; i<64; i++){
			arr[i] = num;
			num *= 2;
		}
		// If the amount we want is 5, 1+2+4+8+16 = 31
		int result = 0;
		int n = 5;
		for(int i=0; i<n; i++){
			result+=arr[i];
		}
		System.out.println(result);
		
		System.out.println(rec(5));
	}
	// Adds up n times starting at 1 and doubles.
	// 1 + 2 + 4 + 8 + 16 = 31
	public static int rec(int n){
		if(n==1)
			return n;
		else
			return valOf(n)+rec(n-1);
	}
	// by putting in 5, we will result in 16. Same as arr[5]=16
	public static int valOf(int index){
		if(index==1)
			return index;
		else
			return 2*valOf(index-1);
	}
}
