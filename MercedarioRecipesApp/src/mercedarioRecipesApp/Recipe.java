package mercedarioRecipesApp;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private String name;
    private int preparationTime;
    private int serves;
    private List<RecipeIngredient> ingredientList = new ArrayList<>();
    private String preparationDescription;

    public void editRecipe() {
        // Logic for editing the recipe
    }

    public boolean deleteRecipe() {
        // Logic for deleting the recipe
        return true;
    }

    public void showPreparation(int serves) {
        // Logic for displaying the preparation
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}

	public int getServes() {
		return serves;
	}

	public void setServes(int serves) {
		this.serves = serves;
	}

	public List<RecipeIngredient> getIngredientList() {
		return ingredientList;
	}

	public void setIngredientList(List<RecipeIngredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	public String getPreparationDescription() {
		return preparationDescription;
	}

	public void setPreparationDescription(String preparationDescription) {
		this.preparationDescription = preparationDescription;
	}

}
