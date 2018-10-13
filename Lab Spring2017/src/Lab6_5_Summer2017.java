import java.util.Scanner;

/*
 * Summer2017 Lab
 * 
 * (Guess the capitals) Write a program that repeatedly prompts the user to enter a capital for a state. 
 * Upon receiving the user input, the program reports whether the answer is correct. Assume that 50 states 
 * and their capitals are stored in a two-dimensional array. The program prompts the user to answer all 
 * states’ capitals and displays the total correct count. The user’s answer is not case-sensitive. Collect 
 * the capitals from http://en.wikipedia.org/wiki/List_of_capitals_in_the_United_States
 * Alabama Montgomery
 * Alaska Juneau
 * Arizona Phoenix
 * ...
 * Here is a sample run:
 * What is the capital of Alabama? Montogomery
 * The correct answer should be Montgomery
 * What is the capital of Alaska? Juneau
 * Your answer is correct
 * What is the capital of Arizona?
 * ...
 * You guessed 35 state capitals out of 50. That is: 70%
 */
public class Lab6_5_Summer2017 {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		int grade = 0;

		String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", 
				"Colorado", "Connecticut", "Delaware", "Florida", "Georgia",
				"Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
				"Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", 
				"Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio",
				"Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina",
				"South Dakota", "Tennessee", "Texas", "Utah", "Vermont",
				"Virgina", "Washington", "West Virginia", "Wisconsin", "Wyoming"};

		String[] capital = {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento",
				"Denver", "Hartford", "Dover", "Tallahassee", "Atlanta",
				"Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines",
				"Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis",
				"Boston", "Lansing", "Saint Paul", "Jackson", "Jefferson City",
				"Helena", "Lincoln", "Carson City", "Concord", "Trenton",
				"Santa Fe", "Albany", "Raleigh", "Bismarck", "Columbus",
				"Oklahome City", "Salem", "Harrisburg", "Providence", "Columbia",
				"Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier",
				"Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"};

		for(int i=0; i<states.length; i++){
			System.out.print("What is the capital of " + states[i] + "? ");
			if(capital[i].equalsIgnoreCase(stdin.next())){
				System.out.println("Your answer is correct");
				grade++;
			}
			else System.out.println("The correct answer is " + capital[i]);
		}
		System.out.print("You guessed " + grade + " state capitals out of 50. This is: " + (grade*2) +"%" );
	}
}