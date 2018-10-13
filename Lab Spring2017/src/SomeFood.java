/*
 * Lab 19 part 2
 */
public abstract class SomeFood {
	// description of food and calories per serving
	private String description;
	private int calories;
	
	public void setDescription(String description){
		this.description = description;
	}
	public void setCaloires(int colories){
		this.calories = calories;
	}
	public String getDescription(){
		return this.description;
	}
	public int getCalories(){
		return this.calories;
	}
	
	public abstract int numOfCal(int numOfServing);
}