/*
 * Fanng Dai
 * 109684495
 * CSE114 - Lab12
 * Homework #5
 */
public class RecipeIngredient extends Ingredient{
	private double quantity;

	public RecipeIngredient(String Ingredientname, String measuringUnit, int caloriesPerUnit, double quantity){
		super(Ingredientname, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	public void setQuantity(double quantity){
		this.quantity = quantity;
	}
	public double getQuantity(){
		return this.quantity;
	}

	public boolean equals(RecipeIngredient recipeIngredient){
		Ingredient ingredient = new Ingredient(recipeIngredient.getIngredientName(),recipeIngredient.getMeasuringUnit(),recipeIngredient.getCaloriesPerUnit());
		super.equals(ingredient);
		if(this.quantity != recipeIngredient.getQuantity()){
			return false;
		}
		return true;
	}

	public String toString(){
		String output = "";
		output += "Recipe Ingredient\n";
		output += "Name=" + getIngredientName() + "\n";
		output += "Measuring Unit=" + getMeasuringUnit() + "\n";
		output += "Calories Per Unit " + getCaloriesPerUnit() + "\n";
		output += "Quantity " + getQuantity() + "\n";
		return output;
	}
}