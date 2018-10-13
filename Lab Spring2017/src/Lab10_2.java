/*
 * Lab 10 part 2
 * Given an array of size 3 by 3, tic-tac-toe board, program will
 * randomly fill in the array with 0 and 1's. Given the filled 2d
 * array, program will let user know which rows and columns are 
 * winners. Such that they are either all filled with 0 or 1's.
 */
public class Lab10_2 {
	public static void main(String[] args)
	{
		int[][] board = new int[3][3];

		// Fill in array randomly with 0 and 1's
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				board[row][col] = (int)(Math.random()*2);
			}
		}

		// Prints the board
		for(int row=0; row<3; row++)
		{
			for(int col=0; col<3; col++)
			{
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
		
		// Checks each row
		for(int i=0; i<3; i++)
		{
				if(board[i][0]==board[i][1] && board[i][1]==board[i][2])
					System.out.println("All " + board[i][0] + "'s on row " + i + ".");
		}
		// Checks each column
		for(int i=0; i<3; i++)
		{
				if(board[0][i]==board[1][i] && board[1][i]==board[2][i])
					System.out.println("All " + board[0][i] + "'s on column " + i + ".");
		}
		//Check diagonal
		if(board[0][0] == board[1][1] & board[1][1] == board[2][2])
			System.out.println("All " + board[0][0] + "'s on diagonal (top left to bottom right).");
		if(board[0][2] == board[1][1] & board[1][1] == board[2][0])
			System.out.println("All " + board[0][0] + "'s on diagonal (top right to bottom left).");
	}
}
