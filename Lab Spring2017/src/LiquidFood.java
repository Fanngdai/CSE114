/*
 * Lab 19 part 2
 */
public class LiquidFood extends SomeFood{
	private int viscosity;
	
	LiquidFood(int viscosity){
		this.viscosity = viscosity;
	}
	public int numOfCal(int numOfServing){
		return numOfServing * getCalories();
	}
	
	public static void main(String[] args){
		
	}
}
