/*
 * Used to represent a gambler/player for the game
 *
 * Must have complete information hiding -- which means all global variables
 * must be declared private & if you wish to access it, you will have mutators
 * and accessors
 */
public class Gambler {
    // Every gambler must have a name, which once assigned cannot be changed
    private final String name;
    // account balance must be between 10 & 100,000
    private double origBalance;
    private double acctBalance;

    /*
     * Constructor
     */
    public Gambler(String name, double acctBalance) {
        this.name = name;
        this.origBalance = acctBalance;
        this.acctBalance = acctBalance;
    }

    /*
     * Allows the user to get information on how well he/she played overall.
     * Calculates the percentae increase or decrease in winnings from when
     * he/she started playing
     */
    private double getWinPercent() {
        return (this.acctBalance - this.origBalance) / this.origBalance;
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public double getAccountBalance() {
        return this.acctBalance;
    }
    // Mutators
    public void setAccountBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    /*
     * @return      String which contains the users name, current account balance,
     *              percentage increase/decrease & brief commentary depending on
     *              wheater the player is making money, losing money, or broke
     */
    public String toString() {
        String rtn = this.name + ", you have a balance of $" + this.acctBalance + "\n";

        double percent = this.getWinPercent() * 100;
        if(percent<0) {
            percent *= -1;
            rtn += "You've lost " + percent + "% of your money.\n";
        } else {
            rtn += "You've won " + percent + "% of your money.\n";
        }

        // Broke
        if(percent < -0.75) {
            rtn += "You broke dude";
        // Losing money
        } else if(percent < 0) {
            rtn += "Don't let the losing get you down, try again!";
        // Winning money
        } else {
            rtn += "Wow! So much money!";
        }

        return rtn;
    }
}
