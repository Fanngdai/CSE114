/*
 * Fanng Dai
 * sbuid
 * CSE114 - Lab12
 * Homework #5
 */
public class TestRecipeBook {
	public static void main(String[] args){

		System.out.println("Checks Ingredient class");
		Ingredient flour = new Ingredient("flour", "mg", 3);
		Ingredient egg = new Ingredient("egg", "each", 5);
		Ingredient oil = new Ingredient("oil", "ml", 4);
		Ingredient flour2 = new Ingredient("flour", "mg", 3);

		System.out.println(flour);
		System.out.println(oil);

		if(flour.equals(oil)){
			System.out.println("flour is equal to oil.");
		}
		else{
			System.out.println("flour is not equal to oil.");
		}

		if(flour.equals(flour2)){
			System.out.println("flour is equal to flour.");
		}
		else{
			System.out.println("flour is not equal to flour.");
		}
		System.out.println();



		System.out.println("Checks Recipe Ingredient class");
		RecipeIngredient recipeIngredientFlour = new RecipeIngredient("flour", "mg", 3, 100);
		RecipeIngredient recipeIngredientOil = new RecipeIngredient("oil", "ml", 4, 10);
		RecipeIngredient recipeIngredientFlour1 = new RecipeIngredient("flour", "mg", 3, 100);
		RecipeIngredient recipeIngredientEgg = new RecipeIngredient("egg", "each", 5, 20);

		System.out.println(recipeIngredientFlour);
		System.out.println(recipeIngredientOil);

		if(recipeIngredientFlour.equals(recipeIngredientOil)){
			System.out.println("recipeIngredientFlour is equal to recipeIngredientOil.");
		}
		else{
			System.out.println("recipeIngredientFlour is not equal to recipeIngredientOil.");
		}

		if(recipeIngredientFlour.equals(recipeIngredientFlour1)){
			System.out.println("recipeIngredientFlour is equal to recipeIngredientFlour1.");
		}
		else{
			System.out.println("recipeIngredientFlour is not equal to recipeIngredientFlour1.");
		}
		System.out.println();



		System.out.println("Checks Cooking Recipe class");
		CookingRecipe cookingRecipe1 = new CookingRecipe("RecipeIngredient");
		CookingRecipe cookingRecipe2 = new CookingRecipe("recipeIngredientOil");
		CookingRecipe cookingRecipe3 = new CookingRecipe("recipeIngredientOil");
		// Same quantity
		cookingRecipe1.addOrUpdateRecipeIngredient(flour, 100);
		System.out.println(cookingRecipe1);
		// Different quantity
		cookingRecipe1.addOrUpdateRecipeIngredient(oil, 20);
		System.out.println(cookingRecipe1);

		System.out.println("Total calories " + cookingRecipe1.calculateCalories());
		System.out.println("Number of Ingredients " + cookingRecipe1.getNumberOfIngredients());

		System.out.println("Flour Recipe\n" + cookingRecipe1.getRecipeIngredient(flour));
		System.out.println("Flour Recipe\n" + cookingRecipe1.getRecipeIngredient("flour"));

		System.out.println("Remove flour\n" + cookingRecipe1.removeRecipeIngredient(flour));
		System.out.println("Number of Ingredients " + cookingRecipe1.getNumberOfIngredients());
		System.out.println("Remove oil\n" + cookingRecipe1.removeRecipeIngredient("oil"));
		System.out.println("Number of Ingredients " + cookingRecipe1.getNumberOfIngredients());

		System.out.println("Cooking Recipe 1\n" + cookingRecipe1);

		if(cookingRecipe1.equals(cookingRecipe2)){
			System.out.println("COOKING RECIPE 1 IS EQUAL TO COOKING RECIPE 2 (THEY ARE NOT)");
		}
		else{
			System.out.println("COOKING RECIPE 1 IS NOT EQUAL TO COOKING RECIPE 2 (THEY ARE NOT)");
		}

		if(cookingRecipe3.equals(cookingRecipe2)){
			System.out.println("COOKING RECIPE 3 IS EQUAL TO COOKING RECIPE 2 (THEY ARE)");
		}
		else{
			System.out.println("COOKING RECIPE 3 IS NOT EQUAL TO COOKING RECIPE 2 (THEY ARE)");
		}

		System.out.println("Checks Recipe Book class");
		RecipeBook book1 = new RecipeBook("Book1");
		RecipeIngredient[] ingredientArray = {recipeIngredientFlour, recipeIngredientOil};
		RecipeBook book2 = new RecipeBook("Book2");
		RecipeIngredient[] ingredientArray2 = {recipeIngredientOil, recipeIngredientFlour1, recipeIngredientEgg};

		book1.addRecipe("name of cooking recipe 1", ingredientArray);
		book2.addRecipe("name of cooking recipe 2", ingredientArray2);
		System.out.println(book1);
		System.out.println(book2);

		// Prints the ingredients in this array.
		CookingRecipe[] testing = book1.findRecipes(ingredientArray);
		for(int i=0; i<testing.length; i++){
			System.out.println(testing[i]);
		}

		testing = book2.findRecipes(ingredientArray);
		for(int i=0; i<testing.length; i++){
			System.out.println(testing[i]);
		}

		// Should print book1
		testing = book2.findRecipesWithFewIngredients(3);
		if(testing == null){
			System.out.println("Nothing");
		}
		else{
			for(int i=0; i<testing.length; i++){
				System.out.println(testing[i]);
			}
		}

		testing = book1.findRecipesLowCalories();
		if(testing == null){
			System.out.println("Nothing");
		}
		else{
			for(int i=0; i<testing.length; i++){
				System.out.println(testing[i]);
			}
		}

		// removes flour from book1
		book1.removeRecipe("name of cooking recipe 1");
		System.out.println(book1);

		RecipeBook book3 = book2;

		if(book3.equals(book2)){
			System.out.println("Book2 and Book3 are the same. (Correct)");
		}
		else{
			System.out.println("Book2 and Book3 are not the same. (Wrong)");
		}

		if(book1.equals(book2)){
			System.out.println("Book1 and Book2 are the same. (Wrong)");
		}
		else{
			System.out.println("Book1 and Book2 are not the same. (Correct)");
		}
	}
}
