/*
 * This is a midterm 1 practice question
 * A bank charges $10 per month plus the following check fess for a commercial checking account:
 * $0.10 each for 1-19 checks
 * $0.08 each for 20-30 checks
 * $0.06 each for 40-59 checks
 * $0.04 each for 60 or more checks
 * 
 * The banks also charges an additional $15 if the balance of the account falls below $400(before any
 * check fees are applied). This program will store the beginning balance of an account and the number
 * of checks written. It contains a method that returns the bank's service fees for the month.
 * 
 */
public class CheckingAccount {
	private static double balance;
	private static int checks;
	
	// mutator methods
	public void setBalance(double b){
		balance = b;
	}
	public void setCheck(int c){
		checks = c;
	}
	
	// calculates the fees for account
	public static double fees(){
		double charges=0;
		
		if(checks>0 && checks<20)
		{
			charges += (checks*0.10);
		}
		else if(checks>19 && checks<40){
			charges += (checks*0.08);
		}
		else if(checks>39 && checks<60){
			charges += (checks*0.06);
		}
		else charges += (checks*0.04);
		
		// Charge $15 if the account falls below $400
		if(balance<400){
			charges += 15;
		}
		
		// initial fee $10. The fees for this bank account.
		return (charges-10);
	}
}
