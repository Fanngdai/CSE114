/*
 * Name:
 * ID:
 * Section:
 * Email:
 * Part 1
 * 
 * Explanation:
 * A dice game called "43." Game will be initiated with 6 rolls of a regular 6 sided dice.
 * Program will automatically roll for the user. If a double is rolled, an extra turn is given.
 * But if the total is either 10, 20, 30 or 40, the user loses. Program will ask the user
 * to enter yes or no after each game. If "yes" is entered, program will reset and replay the
 * game. If anything other than "yes" is entered, program will end.
 */
import java.util.Scanner;

public class DiceGame {

	@SuppressWarnings("resource")
	public static boolean playAgain()
	{
		String answer;
		System.out.print("Would you like to play again (Yes or No)? ");
		Scanner input = new Scanner(System.in);
		answer = input.next();

		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println(" ");
			// reset everything
			return true;
		}
		else 
		{
			System.exit(0);
			return false;
		}
	}

	public static void main(String args[])
	{

		do{
			int max = 6, roll1, roll2, total = 0;

			for(int count=1; count<=max; count++)
			{

				if (count == 1)
				{
					System.out.println("IT'S TIME TO PLAY 43!");
				}

				roll1 = (int)(Math.random()*6)+1;
				roll2 = (int)(Math.random()*6)+1;
				total = (total + roll1 + roll2);

				System.out.print("ROLL #" + count + ": " + roll1 + " " + roll2);

				if(roll1 == roll2)
				{
					max++;
					System.out.print(" DOUBLES!!! ");
				}

				System.out.println(" YOUR TOTAL IS: " + total);

				// Lose if one of these are true
				if(total==10 || total==20 || total==30 || total==40 || (total<43 && count==max))
				{
					System.out.println("TOO BAD! YOU LOSE!");
					System.out.println(" ");
					break;
				}
				// If you reached 43, you win
				if (total >= 43)
				{
					System.out.println("YOU ARE A WINNER!");
					System.out.println(" ");
					break;
				}
			}
		}while(playAgain());
	}

}