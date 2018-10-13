/*
 * Lab 20 part 1
 */

public class Square extends GeometricObject implements Colorable{

	public void howToColor() {
		System.out.println("Chicken-nugget");
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args){
		GeometricObject[] geo = new GeometricObject[5];
		Square square = new Square();

		for(int i=0; i<geo.length; i++)
			geo[i] = square;

		for(int i=0; i<geo.length; i++){
			if(geo[i] instanceof Colorable){
				((Colorable)geo[i]).howToColor();
			}
			else{
				System.out.println("Cats");
			}
		}
		
		for(int i=0; i<geo.length; i++){
			if(geo[i] instanceof Colorable){
				((Colorable)geo[i]).howToColor();
			}
			else{
				System.out.println("Cats");
			}
		}
	}
}