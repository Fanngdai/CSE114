/*
 * Lab 15 part 2
 */
public class RegularPolygon extends GeometricObject{
	// amount of sides
	private int n;
	// length of side
	private double side;
	// x-corrdinate of polygon's center
	private double x;
	// y=coordinate of polygon's center
	private double y;
	
	public RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public void setN(int n){
		this.n = n;
	}
	public void setSide(double side){
		this.side = side;
	}
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	
	public int getN(){
		return this.n;
	}
	public double getSide(){
		return this.side;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	
	public double getPerimeter(){
		return this.n * this.side;
	}
	public double getArea(){
		double temp = side / (2*Math.tan(180/n));
		return temp*getPerimeter()/2;
	}
	
	public static void main(String[] args){
		RegularPolygon regular = new RegularPolygon();
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}