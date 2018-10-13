/*
 * Lab 17 part 2
 */
public class Triangle extends IllegalTriangleException{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double side1, double side2, double side3)throws IllegalTriangleException{
		if(side1 + side2 < side3)
			throw new IllegalTriangleException("Error");
		else if(side1 + side3 < side2)
			throw new IllegalTriangleException("Error");
		else if(side2 + side3 < side1)
			throw new IllegalTriangleException("Error");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public static void main(String[] args)throws Exception{
		Triangle triangle = new Triangle(3,4,5);
		System.out.print("testing ");
	}
}