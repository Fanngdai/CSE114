/*
 * Fanng Dai
 * 109684495
 * CSE114
 * UNO!
 * Final Project
 * One out of four classes
 * 
 * The Player
 */

import java.util.ArrayList;

public class Player {
	// Cards in players hand
	private ArrayList<Card> deck = new ArrayList<Card>();
	
	public void drawCard(){
		this.deck.add(Deck.pickCard());
	}

	// Gives you the last card drawn
	public Card getLastDrawnCard(){
		return this.deck.get(this.deck.size()-1);
	}
	
	// removes card from player hand and add into discard pile
	public void playCard(Card card){
		this.deck.remove(card);
		Deck.putInDiscardPile(card);
	}
	
	// How many cards does player have?
	public int cardAmt(){
		return this.deck.size();
	}
	// All cards player has.
	public ArrayList<Card> allCards(){
		return this.deck;
	}
	
	public String toString(){
		String output = "";
		for(int i=0; i<deck.size(); i++){
			output += deck.get(i) + "\n";
		}
		return output;
	}
}