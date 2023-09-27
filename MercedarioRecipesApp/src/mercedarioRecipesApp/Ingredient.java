package mercedarioRecipesApp;

class Ingredient {
    private String name;
    private Unit unit;
    private float valuePerUnit;
    private String purchasePlace;
    private float caloriesPerUnit;

    public void editIngredient() {
        // Logic for editing the ingredient
    }

    public boolean deleteIngredient() {
        // Logic for deleting the ingredient
        return true;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public float getValuePerUnit() {
		return valuePerUnit;
	}

	public void setValuePerUnit(float valuePerUnit) {
		this.valuePerUnit = valuePerUnit;
	}

	public String getPurchasePlace() {
		return purchasePlace;
	}

	public void setPurchasePlace(String purchasePlace) {
		this.purchasePlace = purchasePlace;
	}

	public float getCaloriesPerUnit() {
		return caloriesPerUnit;
	}

	public void setCaloriesPerUnit(float caloriesPerUnit) {
		this.caloriesPerUnit = caloriesPerUnit;
	}
}