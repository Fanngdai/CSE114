/*
 * Fanng Dai
 * 109684495
 * CSE114 - Lab12
 * Homework #5
 */
public class Ingredient {
	private String ingredientName;
	private String measuringUnit;
	private int caloriesPerUnit;

	public Ingredient(String ingredientName, String measuringUnit, int caloriesPerUnit){
		this.ingredientName = ingredientName;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}

	public void setName(String ingredientName){
		this.ingredientName = ingredientName;
	}
	public void setMeasuringUnit(String measuringUnit){
		this.measuringUnit = measuringUnit;
	}
	public void setCaloriesPerUnit(int caloriesPerUnit){
		this.caloriesPerUnit = caloriesPerUnit;
	}

	public String getIngredientName(){
		return this.ingredientName;
	}
	public String getMeasuringUnit(){
		return this.measuringUnit;
	}
	public int getCaloriesPerUnit(){
		return this.caloriesPerUnit;
	}

	public boolean equals(Ingredient ingredient){
		if(!this.ingredientName.equals(ingredient.getIngredientName()) || !this.measuringUnit.equals(ingredient.getMeasuringUnit()) || this.caloriesPerUnit != ingredient.getCaloriesPerUnit()){
			return false;
		}
		return true;
	}
	public String toString(){
		String output = "";
		output += "Ingredient\n";
		output += "Name=" + this.ingredientName + "\n";
		output += "Measuring Unit=" + this.measuringUnit + "\n";
		output += "Calories Per Unit " + this.caloriesPerUnit + "\n";
		return output;
	}
}