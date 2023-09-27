package mercedarioRecipesApp;

class RecipeIngredient extends Ingredient {
    float quantity;

    public float calculateCost() {
        // Logic for cost calculation
        return getValuePerUnit() * quantity;
    }

    public float calculateCalories() {
        // Logic for calorie calculation
        return getCaloriesPerUnit() * quantity;
    }

	public void setQuantity(float f) {
		// TODO Auto-generated method stub
		
	}

	public String getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}


}