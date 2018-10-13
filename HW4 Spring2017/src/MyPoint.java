/*
 * Fanng Dai
 * sbuid
 * CSE114
 * Homework #4
 * Part 2: MyPoint.java class
 *
 * Test class called TestMyPoint
 */
public class MyPoint {
	// x and y represents the coordinates
	private double x;
	private double y;

	// Creates point (0,0)
	public MyPoint(){
		// We don't need this because default is 0
		this.x=0;
		this.y=0;
	}
	// Creates specified points
	public MyPoint(double a, double b){
		this.x=a;
		this.y=b;
	}

	// Accessor
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}

	// returns the distance from this point to another point of the MyPoint type
	public double distance(MyPoint point){
		return Math.sqrt(Math.pow((x-point.getX()),2) + Math.pow((y-point.getY()),2));
	}

	public double distance(double a, double b){
		return Math.sqrt(Math.pow(x-a,2) + Math.pow(y-b,2));
	}
}
