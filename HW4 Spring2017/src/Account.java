/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #4
 * Part 5: Account.java class
 */
public class Account {
	private int id;
	private double balance;
	// stores the current interest rate
	private double annualInterestRate;
	// stores the date when the account was created
	private java.util.Date dateCreated;

	public Account(){
		this.id = 0;
		this.balance = 1000;
		this.annualInterestRate = 4.50;
	}

	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}

	// Accessor
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	// returns the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	// Mutator
	public void setId(int num){
		id = num;
	}
	public void setBalance(double num){
		balance = num;
	}
	public void setAnnualInterestRate(double num){
		annualInterestRate = num;
	}

	// withdraws a specified amount from the account
	public void withDraw(double amount){
		if(amount>balance){
			System.out.print("There is not enough money in your account!");
		}
		else
			balance -= amount;
	}

	public void deposit(double amount){
		balance += amount;
	}
}
