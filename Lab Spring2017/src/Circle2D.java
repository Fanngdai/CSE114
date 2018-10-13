/*
 * Lab 13 part 2
 */
public class Circle2D {
	private double x;
	private double y;
	private double radius;
	private double area;
	
	public Circle2D(){
		this.x = 0;
		this.y = 0;
		this.radius = 1;
	}
	public Circle2D(double x, double y, double radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return Math.PI * Math.pow(radius, 2);
	}
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	// returns true if the specified point (x, y) is inside this circle
	public boolean contains(double x, double y){
		double xValue = Math.pow(x-this.x, 2);
		double yValue = Math.pow(y-this.y, 2);
		double answer = Math.sqrt(xValue + yValue);
		if(answer < this.radius)
			return true;
		return false;
	}
	// returns true if the specified circle is inside this circle
	public boolean contains(Circle2D circle){
		double xValue = Math.pow(circle.getX()-this.x, 2);
		double yValue = Math.pow(circle.getY()-this.y, 2);
		double answer = Math.sqrt(xValue + yValue);
		if(answer < this.radius)
			return true;
		return false;
	}
	// returns true if the specified circle overlaps with this circle
	public boolean overlaps(Circle2D circle){
		double xValue = Math.pow(circle.getX()-this.x, 2);
		double yValue = Math.pow(circle.getY()-this.y, 2);
		double answer = Math.sqrt(xValue + yValue);
		if(answer == this.radius)
			return true;
		return false;
	}
}