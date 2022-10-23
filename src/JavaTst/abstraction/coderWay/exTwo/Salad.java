package JavaTst.abstraction.coderWay.exTwo;

import java.util.ArrayList;
import java.util.List;

public class Salad extends Recipes {

    private List<String> ingredientsList = new ArrayList<>();
    int time;

    Salad (String dishName, String type, int timeToCook) {
        this.dishName = dishName;
        this.type = type;
        this.time = timeToCook;
    }

    public void addIngredients(String ingredient) {
        ingredientsList.add(ingredient);
    }

    public void showIngredients() {
        System.out.println(ingredientsList);
    }

    public void showRecipes() {}
}
