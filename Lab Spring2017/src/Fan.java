/*
 * Lab 12 part 1
 * Objects and Classes Part 2
 * 
 * Test class called FanTest
 */

public class Fan {
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	// no-arg constructor that creates a default fan
	public Fan(){
		
	}
	
	// Mutator
	public void setSpeed(int num){
		speed = num;
	}
	public void setOn(boolean flag){
		on = flag;
	}
	public void setRadius(double num){
		radius = num;
	}
	public void setColor(String s){
		color = s;
	}
	
	// Accessor
	public int getSpeed(){
		return speed;
	}
	public boolean getOn(){
		return on;
	}
	public double getRadius(){
		return radius;
	}
	public String getColor(){
		return color;
	}
	
	public String toString(){
		if(on){
			return ("Speed " + speed + " Color " + color + " Radius " + radius);
		}
		else{
			return (color + radius + "fan is off");
		}
	}
	
	public static void main(String[] args){
		Fan f = new Fan();
	}
}