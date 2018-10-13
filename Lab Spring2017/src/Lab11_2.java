/*
 * A program which will print a 8*8 board filled randomly with 0 and 1's.
 * If there is a row, column or diagonal which is filled with all 0s or 1s,
 * Program will inform user.
 */
public class Lab11_2 {
	public static void main(String[] args){
		int[][] board = new int[8][8];
		boolean checkLeft=true, checkRight= true;

		// Fill up board with 0 and 1's
		for(int row=0; row<8; row++){
			for(int col=0; col<8; col++){
				board[row][col]=(int)(Math.random()*2);
			}
		}
		// Print board
		for(int row=0; row<8; row++){
			for(int col=0; col<8; col++){
				System.out.print(board[row][col]);
			}
			System.out.println();
		}
		System.out.println();

		// Check for rows, columns and diagonals
		for(int row=0; row<8; row++){
			boolean checkRow = true, checkCol = true;

			for(int col=0; col<8; col++){
				// Check row
				if(board[row][col]!=board[row][0]){
					checkRow = false;
				}
				// Check column switch the role of row and col so col=row & row=col
				if(board[0][row]!=board[col][row]){
					checkCol = false;
				}
				// Check Diagonal Top left to bottom right
				if(board[row][row]!=board[col][col]){
					checkLeft = false;
				}
				// Check Diagonal Top right to bottom left
				if(row+col==7 && board[row][col]!=board[7][0])
				{
					checkRight = false;
				}
			}
			if(checkRow){
				System.out.println("Row " + row + " has all " + board[row][0]);
			}
			if(checkCol){
				System.out.println("Col " + row + " has all " + board[0][row]);
			}
			if(checkLeft && row==7){
				System.out.println("Diagonal (top left to bottom right has all) " + board[0][row]);
			}
			if(checkRight && row==7){
				System.out.println("Diagonal (top right to bottom left has all) " + board[row][0]);
			}
		}
	}
}