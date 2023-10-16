package mercedarioRecipesApp;

import java.util.List;

enum UNIT {
    GRAM,
    LITER,
    PIECE
}

public class Main {
    public static void main(String[] args) {
        // Creación de un usuario
        User user = new User();
        user.setUserName("DianaB");
        user.setPassword("myPassword");
        user.setUserType(USER_TYPE.Chef);

        if (user.authenticate(USER_TYPE.Chef, "myPassword")) {
            System.out.println(user.getUserName() + " has been authenticated successfully as a " + user.getUserType());
        }

        // Creación y gestión de ingredientes
        FacadeMAnager manager = new FacadeMAnager();
        Ingredient sugar = new Ingredient("Sugar", 100, 0.5, "Supermarket", 20);
        manager.addIngredient(sugar);

        Ingredient milk = new Ingredient("Milk", 1, 1.0, "Grocery Store", 50);
        manager.addIngredient(milk);

        System.out.println("\nIngredients in the manager:");
        List<Ingredient> ingredients = manager.viewIngredients();
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.toString());
        }

        // Creación y gestión de recetas
        RecipeIngredient recipeSugar = new RecipeIngredient(50, sugar);
        RecipeIngredient recipeMilk = new RecipeIngredient(0.5, milk);

        Recipe cake = new Recipe();
        cake.setName("Cake");
        cake.setPreparationTime(1);
        cake.setServes(4);
        cake.setPreparationDescription("Mix sugar and milk then bake.");
        cake.getIngredientList().add(recipeSugar);
        cake.getIngredientList().add(recipeMilk);
        cake.addRecipe();

        System.out.println("\nRecipes:");
        List<Recipe> recipes = cake.viewRecipes();
        for (Recipe r : recipes) {
            System.out.println(r.toString());
        }
    }
}
