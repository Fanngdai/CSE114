
public class Tartan {
	public static void tartan(int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if((i+j) % 2==0)
					System.out.print(n);
				else if((i+j) % 2 == 1)
					System.out.print(n-1);
			}
			System.out.println();
		}
	}
	
	// Recursion
	public static void tartanRec(int n){
		System.out.print("tartan Recursion " + n);
		tartanRec(0,n);
	}
	public static void tartanRec(int i, int n){
		if(i==n) return;
		System.out.println();
		tartanRec(i, 0, n);
		tartanRec(++i,n);
	}
	public static void tartanRec(int i, int j, int n){
		if(j==n) return;
		if((i+j)%2==0)
			System.out.print(n);
		else if((i+j)%2==1)
			System.out.print(n-1);
		tartanRec(i,++j,n);
	}
	
	public static void main(String[] args){
//		tartan(3);
//		System.out.println();
//		tartan(4);
//		System.out.println();
		tartanRec(3);
		System.out.println();
		tartanRec(4);
		System.out.println();
	}
}
