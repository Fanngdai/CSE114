/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #4
 * Part 4: Time.java class
 * 
 * Class tests the methods of Time class.
 */
public class TestTime {
	public static void main(String[] args){
		Time time1 = new Time();
		System.out.println(time1.getHour() + " " + time1.getMinute() + " " + time1.getSecond());
		
		Time time2 = new Time(555550000);
		System.out.println(time2.getHour() + " " + time2.getMinute() + " " + time2.getSecond());
	}
}