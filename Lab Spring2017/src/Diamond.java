/*
 * Prints Diamond shape. Recursively and non-recursively.
 * Practice for final
 */
public class Diamond {
	public static void main(String[] args){
		diamond(11);
		diamondRec(21);
	}
	public static void diamond(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i+j == n/2)
					System.out.print("*");
				else if(j-i==n/2)
					System.out.print("*");
				else if(i-j==n/2)
					System.out.print("*");
				else if(j+i == 3*(n/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void diamondRec(int n){
		if(n==0)
			return;
		diamondRec(0,n);
	}
	public static void diamondRec(int i, int n){
		if(i==n)
			return;
		System.out.println();
		diamondRec(i, 0, n);
		diamondRec(++i, n);
	}
	public static void diamondRec(int i, int j, int n){
		if(j==n)
			return;
		
		if(i+j == n/2)
			System.out.print("*");
		else if(j-i==n/2)
			System.out.print("*");
		else if(i-j==n/2)
			System.out.print("*");
		else if(j+i == 3*(n/2))
			System.out.print("*");
		else
			System.out.print(" ");
		
		diamondRec(i,++j,n);
	}
}
