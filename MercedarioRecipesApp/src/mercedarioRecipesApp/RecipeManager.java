package mercedarioRecipesApp;

import java.util.ArrayList;
import java.util.List;

class RecipeManager {
    private List<Ingredient> ingredientList = new ArrayList<>();
    private List<Recipe> recipeList = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    public void addRecipe(Recipe recipe) {
        recipeList.add(recipe);
    }

    public List<Ingredient> getIngredientList() {
        return ingredientList;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }
}