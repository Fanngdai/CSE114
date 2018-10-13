/*
 * Lab 12 part 1
 * Objects and Classes Part 2
 * 
 * Test for Fan class
 */
public class FanTest {
	public static void main(String[] args){
		Fan fan1 = new Fan();
		
		fan1.setSpeed(3);
		fan1.setOn(true);
		fan1.setRadius(9.9);
		fan1.setColor("Brown");
		
		System.out.print(fan1.toString());
	}
}