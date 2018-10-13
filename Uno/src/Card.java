/*
 * Fanng Dai
 * 109684495
 * CSE114
 * UNO!
 * Final Project
 * One out of four classes
 * 
 * individual cards
 * Each card has a different color and number
 */
public class Card {
	private String color;
	private int number;
	
	public Card(String color, int number){
		this.color = color;
		this.number = number;
	}
	
	public String getColor(){
		return this.color;
	}
	public int getNumber(){
		return this.number;
	}
	
	public String toString(){
		return color + " " + number;
	}
}