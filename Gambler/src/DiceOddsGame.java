import java.util.Scanner;

/*
 * The actual application, driver class
 */
public class DiceOddsGame {
    static Scanner stdin = new Scanner(System.in);

    public static String options() {
        System.out.print(
            "\t1) Setup a new gambling account\n" +
            "\t2) Make a bet\n" +
            "\tq) Quit\n\n" +
            "Selection: "
        );
        return stdin.next().trim();
    }

    public static String printMainMenu() {
        System.out.println(
            "**********************************************************\n" +
            "** Dice Odds Game Main Menu\t\t\t\t\t\t\t\t**\n" +
            "**\t\t\t\t\t\t\t\t\t\t\t\t\t\t**\n" +
            "** Please type a menu option and press enter.\t\t\t**\n" +
            "**********************************************************\n\n"
        );
        return options();
    }

    public static void printSetUpAcct(Casino casino) {
        System.out.println(
        "**********************************************************\n" +
        "\tWELCOME TO " + casino.getName() + " Casino IN LALA LAS VEGAS\n" +
        "**\t\t\t\t\t\t\t\t\t\t\t\t\t\t**\n" +
        "** Thank you for choosing our casino for your\t\t\t**\n" +
        "** gambling pleasure. We will thoroughly enjoy\t\t\t**\n" +
        "** ripping you off.\t\t\t\t\t\t\t\t\t\t**\n" +
        "**\t\t\t\t\t\t\t\t\t\t\t\t\t\t**\n" +
        "** Before getting down to business, we need to\t\t\t**\n" +
        "** ask you a few questions to setup your account.\t\t**\n" +
        "**********************************************************\n"
        );
    }

    public static Gambler setUpAccount(Casino casino) {
        printSetUpAcct(casino);
        System.out.println("Please enter your name: ");
        String name = stdin.next();
        System.out.println("Please enter your starting balance ($10 Min): ");
        String balance = stdin.next();
        Gambler gambler = new Gambler(name, Integer.parseInt(balance.substring(1)));

        System.out.println("Thank you, " + name + ", for opening an account with us.\n"
        + "We hope your balance will soon be $0.\n"
        + "PRESS ENTER WHEN YOU ARE READY TO CONTINUE\n\n");
        stdin.nextLine();

        return gambler;
    }

    public static void makeBet(Gambler gambler, Casino casino) {
        if (gambler == null) {
            System.out.println("You must setup a Gambling Account before you start playing!");
            return;
        }
        System.out.println(
        "**************************************************************************\n" +
        "YOU ARE PLAYING " + gambler.getName() + "'S DICE AT " + casino.getName() +" IN DUSTY LAS VEGAS\n\n" +
        "McKenna's Palace IS THE PLACE WHERE YOU HAVE ALL THE FUN, AND WE\n" +
        "EMPTY THE RETIREMENT ACCOUNTS OF POOR OLD PEOPLE, FREE OF CHARGE!\n\n" +
        "GOOD LUCK, YOU'RE GOING TO NEED IT!\n" +
        "**************************************************************************\n\n"
        );

        System.out.print(gambler.getName() + ", enter the #  of rolls you are betting on (1 - 50): ");
        int roll = stdin.nextInt();
        if(roll < 0 || roll > 50) {
            System.out.println("Invalid roll.");
            return;
        }

        System.out.println("For " + roll + "roll(s), WE USE THE FOLLOWING ODDS:");
        for(int i=2; i<=12; i++) {
            System.out.println(i + ":\t " + casino.diceRoll(roll) + " to 1");
        }

        System.out.println(gambler.getName() + ", what roll would you like to bet on? (2-12)");
        int betRoll = stdin.nextInt();
        if(betRoll < 2 || betRoll > 12) {
            System.out.println("Bet roll should be between 2 and 12!");
            return;
        }

        System.out.println(gambler.getName() + ", enter your bet (min $10, max $" + casino.getVault() + "): ");
        int betAmt = Integer.parseInt(stdin.next().trim().substring(1));
        if(betAmt < 10 || betAmt > casino.getVault()) {
            System.out.println("Bet amount not valid!");
            return;
        }


    }


    public static void main(String[] args) {
        Casino casino = new Casino("Fanny");
        Gambler gambler = null;
        String selection;

        do {
            selection = printMainMenu();
            if (selection.equals("1")) {
                gambler = setUpAccount(casino);
            } else if (selection.equals("2")) {
                makeBet(gambler, casino);
            } else {
                System.out.println("User input not valid!");
            }
        } while(!selection.equals("q"));

    }

}
