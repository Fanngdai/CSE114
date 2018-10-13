import java.util.ArrayList;

/*
 * Fanng Dai
 * 109684495
 * CSE114 - Lab12
 * Homework #5
 */
public class CookingRecipe{
	private String cookingRecipeName;
	private ArrayList<RecipeIngredient> list = new ArrayList<RecipeIngredient>();

	public CookingRecipe(String cookingRecipeName){
		this.cookingRecipeName = cookingRecipeName;
	}
	public CookingRecipe(String cookingRecipeName, RecipeIngredient[] arr) {
		this.cookingRecipeName = cookingRecipeName;

		for (RecipeIngredient r : arr)
			list.add(r);
	}

	public void setCookingRecipeName(String cookingRecipeName){
		this.cookingRecipeName = cookingRecipeName;
	}
	public ArrayList<RecipeIngredient> getList(){
		return this.list;
	}
	public String getCookingRecipeName(){
		return this.cookingRecipeName;
	}

	public void addOrUpdateRecipeIngredient(Ingredient ingredient, double quantity){
		String names = ingredient.getIngredientName();
		String measuringUnit = ingredient.getMeasuringUnit();
		int caloriesPerUnit = ingredient.getCaloriesPerUnit();
		RecipeIngredient ingredient2 = new RecipeIngredient(names, measuringUnit, caloriesPerUnit, quantity);
		// Checks all elements to see if ingredient exists s.t. if it does, we update and return
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIngredientName().equals(ingredient.getIngredientName())){
				list.get(i).setQuantity(quantity);
				return;
			}
		}
		// If ingredient does not already exist, we add it in.
		list.add(ingredient2);
		(ingredient2).setQuantity(quantity);
	}
	// if the recipe already includes the ingredient specified by the parameter, 
	// then just update the quantity, otherwise add a new recipe ingredient.
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIngredientName().equals(ingredient.getIngredientName()))
				return list.get(i);
		}
		return null;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIngredientName().equals(ingredientName))
				return list.get(i);
		}
		return null;
	}
	// return the RecipeIngredient object corresponding to the ingredient object 
	// paramater, or return null if the ingredient is not part of the recipe.
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIngredientName().equals(ingredient.getIngredientName())){
				return (list.remove(i));
			}
		}
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getIngredientName().equals(ingredientName)){
				return (list.remove(i));
			}
		}
		return null;
	}
	// remove the given ingredient from the recipe. If the ingredient is part of 
	// the recipe return it, else return null. 
	public double calculateCalories(){
		double caloriesTotal = 0;
		for(int i=0; i<list.size(); i++){
			caloriesTotal += list.get(i).getCaloriesPerUnit() * list.get(i).getQuantity();
		}
		return caloriesTotal;
	}

	// calculates the sum of the calories for all the ingredients in the recipes and their respective quantities.
	public int getNumberOfIngredients(){
		return list.size();
	}
	// returns the number of ingredients in the recipe.
	public boolean equals(CookingRecipe cookingRecipe){
		ArrayList<RecipeIngredient> check = cookingRecipe.getList();
		// Checks the name and the size
		if(!this.cookingRecipeName.equals(cookingRecipe.getCookingRecipeName()) || this.list.size() != check.size()){
			return false;
		}
		// Check each element
		for(int i=0; i<this.list.size(); i++){
			if(this.list.get(i).equals(check.get(i))){
				return false;
			}
		}
		
		// Don't really need. But just in case, checks if the two CookingRecipe have identical Recipe Ingredients.
		this.list.equals(check);
		return true;
	}
	public String toString(){
		String output = this.cookingRecipeName + "\n";
		for(int i=0; i<list.size(); i++){
			output += "Name=" + list.get(i).getIngredientName() + "\n";
			output += "Measuring Unit=" + list.get(i).getMeasuringUnit() + "\n";
			output += "Calories Per Unit " + list.get(i).getCaloriesPerUnit() + "\n";
			output += "Quantity " + list.get(i).getQuantity() + "\n";
		}
		return output;
	}
	// returns the recipe name and ingredients as a String.
	// The specification of this class intentionally does not specify the internal 
	// structure of the class (name, ingredients), so you can design it in any way 
	// you want, as long as you provide the functionalities required above.
}