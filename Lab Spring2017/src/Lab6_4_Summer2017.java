import java.util.Scanner;

/*
 * Summer2017 Lab
 * 
 *  (Algebra: multiply two matrices) Write a method to multiply two matrices. 
 *  The header of the method is:
 *  public static int[][] multiplyMatrix(int[][] a, int[][] b)
 *  To multiply matrix a by matrix b, the number of columns in a must be the same as the number of rows in b, 
 *  and the two matrices must have elements of the same or compatible types. Let c be the result of the multiplication. 
 *  Assume the column size of matrix a is n. Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj.
 */
public class Lab6_4_Summer2017 {
	public static int[][] multiplyMatrix(int[][] a, int[][] b){
		int[][] matrixC = new int[a.length][a[0].length];

		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				for (int k = 0; k < matrixC[0].length; k++) {
					matrixC[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(matrixC[i][j] +"\t");
			}
			System.out.println(" ");
		}

		return matrixC;
	}

	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);

		// Matrix A
		System.out.println("Enter size of matrix A. Row then Column.");
		int rowA = stdin.nextInt();
		int colA = stdin.nextInt();
		int[][] matrixA = new int[rowA][colA];

		// Matrix B
		System.out.println("Enter size of matrix B. Row then Column.");
		int rowB = stdin.nextInt();
		int colB = stdin.nextInt();
		int[][] matrixB = new int[rowB][colB];

		// Randomly assign ints to Matrix A
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
				matrixA[i][j] = (int)(Math.random()*6);
			}
		}
		// Ranmonly assign ints to Matrix B
		for(int i=0; i<rowB; i++){
			for(int j=0; j<colB; j++){
				matrixB[i][j] = (int)(Math.random()*6);
			}
		}
		
		// Print Matrix A and B
		System.out.println("MatrixA");
		for(int i=0; i<rowA; i++){
			for(int j=0; j<colA; j++){
				System.out.print(matrixA[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("MatrixB");
		for(int i=0; i<rowB; i++){
			for(int j=0; j<colB; j++){
				System.out.print(matrixB[i][j] + "\t");
			}
			System.out.println();
		}
		
		// If the column of A and the row of B are not the same, inform user and exit
		if(colA != rowB){
			System.out.println("Column of matrix A must equal matrix B!");
			System.out.println("Good-bye");
			System.exit(0);
		}
		
		System.out.println("The multiplication of this matrix is");
		multiplyMatrix(matrixA, matrixB);
	}
}