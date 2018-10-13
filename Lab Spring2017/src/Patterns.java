/*
 * Final Practice
 */
public class Patterns {

	public static void main(String[] args){

		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				if(j>=i)
					System.out.print(j-i+1 + " ");
			}
			System.out.println();
		}
		for(int i=2; i<=7; i++){
			for(int j=1; j<=7; j++){
				if(i>=j)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();



		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				if(j>=i)
					System.out.print(j + " ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=1; i<=6; i++){
			for(int j=1; j<=7; j++){
				if(j+i>=7)
					System.out.print(j + " ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();


		
		for(int i=1; i<=7; i++){
			for(int j=1; j<=7; j++){
				if(j>=i)
					System.out.print(j + " ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1; i<=6; i++){
			for(int j=1; j<=7; j++){
				if(j+i>=7)
					System.out.print(j + " ");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
/*
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 */
		for(int i=0; i<5; i++){
			for(int j=0; j<5-i; j++)
				System.out.print(" ");
			for(int j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
		
		stars(5);
	}
	
	public static String spaces(int n){
		if(n==0) return "";
		return " " + spaces(n-1);
	}
	public static void stars(int n){
		stars(1,n);
	}
	public static void stars(int i, int n){
		if(i == n+1) return;
		System.out.println("");
		System.out.print(spaces(n-i));
		stars(i, 0, n);
		stars(++i, n);
	}
	public static void stars(int i,int j, int n){
		if(j == i) return;
		stars(i,++j,n);
		System.out.print("* ");
	}
	
}