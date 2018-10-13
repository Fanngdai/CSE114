import java.util.List;
import java.util.Scanner;

/*
 * Fanng Dai
 * sbuid
 * CSE114
 * UNO!
 * Final Project
 * One out of four classes
 *
 * Where everything is executed
 *
 * This game consists of 36 total cards of which, there are four colors (red, blue, yellow and green).
 * Each color consists of a number between 1 and 7.
 *
 * Both players pick a card. If the card is draw 1 or draw 2 or wild,
 * they have to pick again until it is not the same. If the cards are
 * the same number (1 and 1)
 */

public class Uno {
	public static void main(String[] args){
		Deck tempDeck = new Deck();
		boolean playerGoesFirst = false;
		Card topCard;
		int cardIndex;
		String input;
		Scanner stdin = new Scanner(System.in);
		boolean unoCalled;
		boolean compUnoCalled;
		boolean drawCards = false;
		String matchColor;
		int matchNum;

		tempDeck.shuffle();
		Player player = new Player();
		Player computer = new Player();

		// Check to see who goes first
		do{
			player.drawCard();
			computer.drawCard();

			int playerCard = player.getLastDrawnCard().getNumber();
			int computerCard = computer.getLastDrawnCard().getNumber();

			// 8=draw 1 card, 9=draw 2 card, 10=wild card --- cannot be used
			while(playerCard == 8 || playerCard == 9 || playerCard == 10){
				player.drawCard();
				playerCard = player.getLastDrawnCard().getNumber();
			}
			while(computerCard == 8 || computerCard == 9 || computerCard == 10){
				computer.drawCard();
				computerCard = computer.getLastDrawnCard().getNumber();
			}

			System.out.println("Your card: " + player.getLastDrawnCard());
			System.out.println("Opponents card: " + computer.getLastDrawnCard());

			if(playerCard > computerCard)
				playerGoesFirst = true;
			else if(playerCard < computerCard)
				playerGoesFirst = false;

		}while(player.getLastDrawnCard().getNumber() == computer.getLastDrawnCard().getNumber());

		Deck.removeAllCard();
		// Fill up deck and shuffle
		Deck decks = new Deck();
		decks.shuffle();
		player = new Player();
		computer = new Player();

		// Draw 5 cards for each player
		for(int i=0; i<5; i++)
		{
			player.drawCard();
			computer.drawCard();
		}

		// Take a card from draw pile and put it in the discard pile.
		do{
			topCard = Deck.pickCard();
			matchColor = topCard.getColor();
			matchNum = topCard.getNumber();
		}while(matchNum==8 || matchNum==9 || matchNum==10);
		Deck.putInDiscardPile(topCard);




		// while no one wins
		while(player.cardAmt()!=0 || computer.cardAmt()!=0){
			System.out.println();
			System.out.println("Match this card " + matchColor + matchNum);
			unoCalled = false;
			compUnoCalled = false;

			// if player has to draw cards, draw cards and skip turn
			if(playerGoesFirst && matchNum == 8 && !drawCards)
			{
				System.out.println("You drew 1 card. Skips turn.");
				player.drawCard();
				playerGoesFirst = false;
				drawCards = true;
			}
			else if(playerGoesFirst && matchNum == 9 && !drawCards)
			{
				System.out.println("You drew 2 card. Skips turn.");
				player.drawCard();
				player.drawCard();
				playerGoesFirst = false;
				drawCards = true;
			}

			// while card prevents you from playing the wrong card. Or it will ask you type again
			while(playerGoesFirst){
				System.out.println("your cards " + player.allCards());
				System.out.println("Type the position of the card");
				input = stdin.next();

				// Have user call uno before they play card
				if((player.cardAmt()==2) && input.equalsIgnoreCase("uno")){
					unoCalled = true;
					input = stdin.next();
				}
				// Draw card. Skip turn
				if(input.equalsIgnoreCase("draw")){
					player.drawCard();
					playerGoesFirst = false;
				}

				// try prevents program from crashing if you typed draw or uno.
				try{
					cardIndex = Integer.parseInt(input);
					// if the color or number matches then play card.

					if(player.allCards().get(cardIndex).getColor().equals("wild"))
					{
						topCard = player.allCards().get(cardIndex);
						System.out.println("Choose a color: ");
						input = stdin.next();
						while(!(input.equalsIgnoreCase("green") || input.equalsIgnoreCase("yellow")
								|| input.equalsIgnoreCase("red") || input.equalsIgnoreCase("blue"))){
							System.out.println("Choose a color: ");
							input = stdin.next();
						}
						player.playCard(player.allCards().get(cardIndex));
						// HASDHBKASD
						matchColor = input.toLowerCase();
						matchNum = 10;
						playerGoesFirst = false;
					}
					else if(matchColor.equals(player.allCards().get(cardIndex).getColor()) ||
							matchNum == player.allCards().get(cardIndex).getNumber()){
						topCard = player.allCards().get(cardIndex);
						matchColor = topCard.getColor();
						matchNum = topCard.getNumber();
						player.playCard(player.allCards().get(cardIndex));
						playerGoesFirst = false;

						if(matchNum==8 || matchNum ==9){
							drawCards = false;
						}
					}
				}
				catch(Exception ex){

				}
			}

			// If you forget to call uno
			if(!unoCalled && player.cardAmt()==1)
			{
				System.out.println("You must draw 2 cards! You forgot to call Uno!");
				player.drawCard();
				player.drawCard();
			}
			if(player.cardAmt()==0){
				System.out.print("You win!");
				System.exit(0);
			}

			// For testing purposes. Delete after. Tells you computers card
			//			System.out.println("Computer cards " + computer.allCards());
			if(!playerGoesFirst && matchNum == 8 && !drawCards)
			{
				System.out.println("Computer drew 1 card. Skips turn.");
				computer.drawCard();
				drawCards = true;
				playerGoesFirst = true;
			}
			else if(!playerGoesFirst && matchNum == 9 && !drawCards)
			{
				System.out.println("Computer drew 2 cards. Skips turn.");
				computer.drawCard();
				computer.drawCard();
				drawCards = true;
				playerGoesFirst = true;
			}

			// Computer "UNO" 2/3 chances
			if(computer.cardAmt()==2 && (int)Math.round(Math.random()*2)!=0){
				compUnoCalled = true;
			}

			// Play card if matches
			for(int i=0; i<computer.cardAmt(); i++){
				if(((matchColor.equals(computer.allCards().get(i).getColor()) ||
						matchNum == computer.allCards().get(i).getNumber())
						&& matchNum != 10)
						&& !playerGoesFirst){
					topCard = computer.allCards().get(i);
					matchColor = topCard.getColor();
					matchNum = topCard.getNumber();
					computer.playCard(computer.allCards().get(i));
					playerGoesFirst = true;
					System.out.println("Opponent played " + topCard);

					if(matchNum==8 || matchNum ==9){
						drawCards = false;
					}
				}
			}

			// If no cards match. Computer plays wild.
			for(int i=0; i<computer.cardAmt(); i++){
				if(computer.allCards().get(i).getColor().equals("wild") && !playerGoesFirst){
					playerGoesFirst = true;
					topCard = computer.allCards().get(i);
					matchNum = topCard.getNumber();
					computer.playCard(computer.allCards().get(i));
					System.out.println("Opponent played " + topCard);

					switch((int)Math.round(Math.random()*3)){
					case 0:
						matchColor = "red";
						System.out.println("Opponent chooses Red");
						break;
					case 1:
						matchColor = "blue";
						System.out.println("Opponent chooses Blue");
						break;
					case 2:
						matchColor = "green";
						System.out.println("Opponent chooses Green");
						break;
					case 3:
						matchColor = "yellow";
						System.out.println("Opponent chooses Yellow");
						break;
					}
				}
			}
			// If no cards are played,
			if(!playerGoesFirst){
				computer.drawCard();
				System.out.println("Opponent drew a card");
				playerGoesFirst = true;
			}
			if(computer.cardAmt()==1 && !compUnoCalled)
			{
				computer.drawCard();
				computer.drawCard();
				System.out.println("Opponent drew 2 cards! Forgot to say \"UNO\"!");
				playerGoesFirst = true;
			}
			else if(computer.cardAmt()==1 && compUnoCalled){
				System.out.println("Opponent called \"UNO\"!");
			}
			if(computer.cardAmt()==0)
			{
				System.out.print("You lose!");
				System.exit(0);
			}

			//			System.out.println("Checking purposes");
			//			System.out.println(decks);
			//			System.out.println(decks.getSize());
			//			System.out.println();
		}
	}
}
