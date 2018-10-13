import java.util.ArrayList;

/*
 * Fanng Dai
 * sbuid
 * CSE114 - Lab12
 * Homework #5
 */
public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> list = new ArrayList<CookingRecipe>();

	public RecipeBook(String bookName){
		this.bookName = bookName;
	}

	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	public String getBookName(){
		return this.bookName;
	}
	public ArrayList<CookingRecipe> getList(){
		return this.list;
	}

	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients){
		for(int i=0; i<list.size(); i++){
			if( name.equals( list.get(i).getCookingRecipeName() ))
				return null;
		}
		CookingRecipe temp = new CookingRecipe(name, ingredients);
		list.add(temp);
		return temp;
	}
	// adds to the book and returns a new cooking recipe with the given parameters.
	// If recipe book already contains a recipe with the same name, do not create
	// a new one and return null.

	public CookingRecipe removeRecipe(String name){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getCookingRecipeName().equals(name)){
				return (list.remove(i));
			}
		}
		return null;
	}
	// removes the cooking recipe from the cooking book and returns it. If recipe
	// book does not contain a recipe with the specified name, then return null.
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients){
		ArrayList<CookingRecipe> crList = new ArrayList<>();
		boolean flag;
		for(int i=0; i<list.size(); i++){
			CookingRecipe cr = list.get(i);
			flag = true;
			for(int j=0; j<ingredients.length; j++){
				if ( cr.getRecipeIngredient(ingredients[j]) == null )
					flag = false;
			}

			if (flag)
				crList.add(cr);
		}
		if ( crList.size() == 0 )
			return null;

		// Create Array
		CookingRecipe[] crArr = new CookingRecipe[ crList.size() ];
		for (int a = 0; a < crArr.length; a++)
			crArr[a] = crList.get(a);

		return crArr;
	}
	// returns all cooking recipes from the cooking book that contain all the
	// ingredients passed as parameters. If recipe book does not contain any recipe
	// with the specified ingredients, then return null.
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients){
		ArrayList<CookingRecipe> crList = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			CookingRecipe cr = list.get(i);
			if(numberOfIngredients > list.get(i).getNumberOfIngredients()){
				crList.add(cr);
			}
		}
		if ( crList.size() == 0 )
			return null;

		CookingRecipe[] crArr = new CookingRecipe[ crList.size() ];
		for (int a = 0; a < crArr.length; a++)
			crArr[a] = crList.get(a);

		return crArr;
	}
	// returns all cooking recipes from the cooking book that contain less than the
	// number of ingredients passed as parameter. If recipe book does not contain any
	// recipe with the specified number of ingredients, then return null.
	public CookingRecipe[] findRecipesLowCalories(){
		ArrayList<CookingRecipe> crList = new ArrayList<>();
		double lowCalorie = list.get(0).calculateCalories();

		for(int i=0; i<list.size(); i++){
			CookingRecipe cr = list.get(i);
			if(lowCalorie > list.get(i).calculateCalories()){
				crList.removeAll(crList);
				lowCalorie = list.get(i).calculateCalories();
				crList.add(cr);
			}
			else if(lowCalorie == list.get(i).calculateCalories()){
				crList.add(cr);
			}
		}

		CookingRecipe[] crArr = new CookingRecipe[ crList.size() ];
		for (int a = 0; a < crArr.length; a++)
			crArr[a] = crList.get(a);

		return crArr;
	}
	// returns all cooking recipes from the cooking book that have the lowest number
	// of calories. Note: this can be multiple recipies.
	public boolean equals(RecipeBook recipeBook){
		ArrayList<CookingRecipe> check = recipeBook.getList();
		// Checks the name and the size
		if(!this.bookName.equals(recipeBook.getBookName()) || this.list.size() != check.size()){
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
		String output = this.bookName + "\n";
		for(int i=0; i<list.size(); i++){
			output += list.get(i).toString() +"\n";
		}
		return output;
	}
}
