/*
 * Fanng Dai
 * 109684495
 * CSE114
 * Homework #4
 * Part 2: TestMyPoint.java class
 * 
 * Class tests the methods of MyPoint class.
 */
public class TestMyPoint {
	public static void main(String[] args){
		// Point1 and 2 should have the same outcome
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(0,0.0);
		MyPoint point3 = new MyPoint(10,30.5);

		System.out.println(point1.getX());
		System.out.println(point1.getY());
		System.out.println(point2.getX());
		System.out.println(point2.getY());
		System.out.println(point3.getX());
		System.out.println(point3.getY());
		
		System.out.println("Distance");
		System.out.println(point1.distance(point2));	// 0
		System.out.println(point2.distance(point3));	// 32.0975
		System.out.println(point3.distance(point1));	// 32.0975

		System.out.println(point1.distance(0,0.0));		// 0
		System.out.println(point1.distance(10, 30.5));	// 32.0975
	}
}
