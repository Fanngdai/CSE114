/*
 * Used to represent the casino account for teh game
 */
public class Casino {
    private final String name;
    // Should never go below 0
    private double vault;

    public Casino(String name) {
        this.name = name;
        this.vault = 1000000;
    }

    /*
     * Every casine gives different odds for certain games like the slot machines
     */
    public double getOdds() {
        return (this.vault > 1000000) ? .005 : .01;

//        if(this.vault > 1000000) {
//            return .005;
//        } else {
//            return .01;
//        }
    }

    public double diceRoll(int numRolls) {
        double odd = getOdds();

        switch(numRolls) {
            case 2:
            case 12:
                return (36 * Math.pow((1.0 + (3 * odd)), numRolls));
            case 3:
            case 11:
                return (36 * Math.pow((1.0 + (2 * odd)), numRolls));
            case 4:
            case 10:
                return (36 * Math.pow((1.0 + odd), numRolls));
            case 5:
            case 9:
                return (7.2 * Math.pow((1.0 - odd),numRolls));
            case 6:
            case 8:
                return (7.2 * Math.pow((1.0 - odd), numRolls));
            case 7:
                return (6.0 * Math.pow((1.0 - (2 * odd)), numRolls));
        }
        return -1;
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public double getVault() {
        return this.vault;
    }
    // Mutators
    public void setVault(double vault) {
        this.vault = vault;
    }

}
