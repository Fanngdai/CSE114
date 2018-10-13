/*
 * Practice for the final
 * Prints n rows and column forms x.
 */
public class X {
	public static void main(String[] args){
		x(7);
		xRec(11);
	}
	public static void x(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(i == j)
					System.out.print("*");
				else if(i+j== n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static void xRec(int n){
		if(n==0)
			return;
		xRec(0,n);
	}
	public static void xRec(int i, int n){
		if(i==n)
			return;
		System.out.println();
		xRec(i, 0, n);
		xRec(++i, n);
	}
	public static void xRec(int i, int j, int n){
		if(j==n)
			return;
		
		if(i == j)
			System.out.print("*");
		else if(i+j== n-1)
			System.out.print("*");
		else
			System.out.print(" ");
		
		xRec(i,++j,n);
	}
}
