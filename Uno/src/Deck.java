/*
 * Fanng Dai
 * 109684495
 * CSE114
 * UNO!
 * Final Project
 * One out of four classes
 * 
 * default constructor sets up all 36 cards into drawPile.
 * 
 * Shuffle method shuffles all cards in drawPile.
 * 
 * RemoveCard method checks if top of drawPile is empty.
 * If it is empty, all cards in discardPile goes to 
 * drawPile and shuffle.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	private static ArrayList<Card> drawPile = new ArrayList<Card>();
	private static ArrayList<Card> discardPile = new ArrayList<Card>();
	
	public Deck(){
		for(int color=1; color<=4; color++){
			for(int number=1; number<=7; number++){
				if(color == 1)
					drawPile.add(new Card("red",number));
				else if(color == 2)
					drawPile.add(new Card("yellow",number));
				else if(color == 3)
					drawPile.add(new Card("blue",number));
				else
					drawPile.add(new Card("green",number));
			}
		}
		// Draw 1
		drawPile.add(new Card("red", 8));
		drawPile.add(new Card("blue", 8));
		// Draw 2
		drawPile.add(new Card("yellow", 9));
		drawPile.add(new Card("green", 9));
		// Wild
		drawPile.add(new Card("wild", 10));
		drawPile.add(new Card("wild", 10));
		drawPile.add(new Card("wild", 10));
		drawPile.add(new Card("wild", 10));
	}

	public void shuffle(){
		Collections.shuffle(drawPile);
	}
	
	public static Card pickCard(){
		// If the draw pile is empty, put dicardPile into drawPilea and shuffle the deck
		if(drawPile.isEmpty()){
			for(int i=0; i<discardPile.size(); i++)
			{
				drawPile.add(discardPile.get(i));
				discardPile.remove(discardPile.get(i));
			}
			Collections.shuffle(drawPile);
		}
		// Player takes a card such that, drawPile deducts that card and it returns the drawn card
		Card temp = drawPile.get(drawPile.size()-1);
		drawPile.remove(drawPile.size()-1);	
		return temp;	
	}
	
	public int getSize(){
		return drawPile.size();
	}
	
	public static void putInDiscardPile(Card card){
		discardPile.add(card);
	}
	
	// removes everything from piles
	public static void removeAllCard(){
		drawPile.clear();
		discardPile.clear();
	}
	
	public String toString(){
		String output = "";
		for(int i=0; i<drawPile.size(); i++){
			output += drawPile.get(i) + "\n";
		}
		return output;
	}
}