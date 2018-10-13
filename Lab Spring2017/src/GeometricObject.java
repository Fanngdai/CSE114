/*
 * Copied and pasted from inheritance power point
 */
public abstract class GeometricObject implements Comparable, Cloneable{
	
	private String color = "white"; private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean filled){
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	// find the larger of two GeometricObject objects
	public static Object max(Object o1, Object o2){
		if(((Comparable)o1).compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}