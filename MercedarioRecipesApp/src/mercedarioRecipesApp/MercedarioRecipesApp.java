package mercedarioRecipesApp;

public class MercedarioRecipesApp {

    private static User admin;
    private static RecipeManager manager = new RecipeManager();  // Added for managing ingredients and recipes

    public static void main(String[] args) {
        setAdmin(new User());

        // Create a new ingredient
        Ingredient flour = new Ingredient();
        flour.setName("Flour");
        flour.setValuePerUnit(10);
        flour.setCaloriesPerUnit(364);
        flour.setUnit(Unit.KG);
        flour.setPurchasePlace("Local Market");
        
        // Add the ingredient to the manager
        manager.addIngredient(flour);

        // Create a RecipeIngredient from the previous ingredient to use in a recipe
        RecipeIngredient flourForBread = new RecipeIngredient();
        flourForBread.setName(flour.getName());
        flourForBread.setValuePerUnit(flour.getValuePerUnit());
        flourForBread.setCaloriesPerUnit(flour.getCaloriesPerUnit());
        flourForBread.setUnit(flour.getUnit());
        flourForBread.setPurchasePlace(flour.getPurchasePlace());
        flourForBread.setQuantity(0.5f);

        // Create a recipe
        Recipe bread = new Recipe();
        bread.setName("Bread");
        bread.setPreparationTime(3);
        bread.setServes(4);
        bread.getIngredientList().add(flourForBread);
        bread.setPreparationDescription("1. Mix flour...\n2. Bake...");
        
        // Add the recipe to the manager
        manager.addRecipe(bread);

        // Display recipe information
        System.out.println("-----------------------------------------------------------");
        System.out.println("Welcome to the Mercedario menu");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Recipe: " + bread.getName());
        System.out.println("Preparation Time: " + bread.getPreparationTime() + " hours");
        System.out.println("Ingredients:");
        for (RecipeIngredient ingredient : bread.getIngredientList()) {
            System.out.println("- " + ingredient.getName() + ": " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("Steps:");
        System.out.println(bread.getPreparationDescription());
        System.out.println("-----------------------------------------------------------");
    }

	public static User getAdmin() {
		return admin;
	}

	public static void setAdmin(User admin) {
		MercedarioRecipesApp.admin = admin;
	}
}