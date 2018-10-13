/*
 * Playing a TicTacToe game
 * 
 * Program will promt user to enter either X or O. Program will continue to ask the user to
 * enter and place on board until the board runs out of place or either a row or column or
 * diagonal is full of all O or X.
 */
import java.util.Scanner;

public class Lab11_1 {
	public static void main(String[] args){
		int count = 0, row, col;
		// fill array with '-' to state there is a free space here avaliable
		char[][] board = {
				{'-','-','-'},
				{'-','-','-'},
				{'-','-','-'}};
		System.out.println("Enter row then column seperated by enter or space.");
		Scanner stdin = new Scanner(System.in);

		do{
			// takes turn O always first
			if(count%2==0)
			{
				// do while loop. Keep asking user if the spot is already in use.
				do{
					System.out.println("Enter where to locate your \"O\": ");
					row = stdin.nextInt();
					col = stdin.nextInt();
					// If the locations are not valid, we will have to ask user to type until it is
					while(row<0 || row>2){
						System.out.print("Re-enter row: ");
						row = stdin.nextInt();
					}
					while(col<0 || col>2){
						System.out.print("Re-enter column: ");
						col = stdin.nextInt();
					}
					// If spot is taken, keep asking user
				}while(board[row][col]=='X' || board[row][col]=='O');
				// replace only if the space is avaliable
				if(board[row][col] == '-')
					board[row][col] = 'O';
			}
			else
			{
				do{
					System.out.println("Enter where to locate your \"X\": ");
					row = stdin.nextInt();
					col = stdin.nextInt();
					while(row<0 || row>2){
						System.out.print("Re-enter row: ");
						row = stdin.nextInt();
					}
					while(col<0 || col>2){
						System.out.print("Re-enter column: ");
						col = stdin.nextInt();
					}
				}while(board[row][col]=='X' || board[row][col]=='O');
				if(board[row][col] == '-')
					board[row][col] = 'X';
			}

			// Prints the board
			for(int r=0; r<3; r++){
				for(int c=0; c<3; c++){
					System.out.print(board[r][c]);
				}
				System.out.println();
			}

			for(int i=0; i<3; i++)
			{
				// check rows
				if(board[i][0]==board[i][1] && board[i][1]==board[i][2] && board[i][0]!='-'){
					System.out.println(board[i][0] + " Wins!");
					System.exit(0);
				}
				// check columns
				if(board[0][i]==board[1][i] && board[1][i]==board[2][i] && board[0][i]!='-'){
					System.out.println(board[0][i] + " Wins!");
					System.exit(0);
				}
			}
			//Check diagonal
			if(board[0][0] == board[1][1] & board[1][1] == board[2][2] && board[0][0]!='-'){
				System.out.println(board[0][0] + " Wins!");
				System.exit(0);
			}
			if(board[0][2] == board[1][1] & board[1][1] == board[2][0] && board[0][2]!='-'){
				System.out.println(board[0][0] + " Wins!");
				System.exit(0);
			}
		}while(count++ != 8);
		
		System.out.print("DRAW!");
		System.exit(0);
	}
}