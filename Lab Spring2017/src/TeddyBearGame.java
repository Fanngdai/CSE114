/*
 * Lab 23 part5
 * 
 * The object of the Teddy Bear Game is to end up with a number 
 * of bears equal to some value goal that we choose ahead of 
 * time. Your friend gives you a number of stuffed bears we will 
 * call initial. There are two other parameters: increment and n. 
 * During each step of the game you game you may: (a) ask for and 
 * receive from your friend increment more bears; or (b) if you 
 * have an even number of bears, give your friend exactly half your 
 * bears. You must have in your possession exactly goal bears after 
 * at most n steps in order to win
 * For example, let initial be 99, goal be 91 and increment be 53. 
 * If n is a least 4, then the following sequence of steps will 
 * result in a win for you:

• Get 53 bears from friend (99 -> 152)

• Give half of bears to friend (152 -> 76)

• Give half of bears to friend (76 -> 38)

• Get 53 from friend (38 -> 91)

 * Write a recursive method that tells us whether we can reach a 
 * desired goal starting with an initial number of bears and given an 
 * increment and maximum number of steps, n, and prints that path.
 */
public class TeddyBearGame {
	public static boolean TeddyBearGame(int goal, int initial, int increment, int n){
		if(initial == goal){   
			return true;
		}
		else if(n == 0){
			return false;
		}
		else if(TeddyBearGame(goal, initial + increment, increment, n-1)){
			return true;
		}
		else if ((initial % 2 == 0) && TeddyBearGame(goal, initial/2, increment, n-1)){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args){
		if (TeddyBearGame(91, 99, 53, 4))
			System.out.println("Yes. Goal is reachable.");
		else
			System.out.println("No. Goal is not reachable.");
	}
}