package JavaTst.abstraction.coderWay.exTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String ingredients[];
//        ingredients = new String[5];
//        ingredients[0] = "lemon";
//        ingredients[1] = "bacon";
//        System.out.println(ingredients);

//        List<String> ingredientsList = new ArrayList<>();
//        ingredientsList.add("lime");
//        ingredientsList.add(0,"lemon juice");
//        ingredientsList.add(0,"garlic"); //add to the start (lemon juice [1])
//        ingredientsList.add(2,"olive oil");
//        ingredientsList.add("croutons"); //add to the end

        Salad salad = new Salad("caesar", "traditional",
                20);

        Pizza neapolitan = new Pizza("neapolitan", "traditional",
                "large", 25);

        Pizza pizzas[] = new Pizza[3];
        pizzas[0] = new Pizza("margherita", "traditional",
                "medium", 15);
        pizzas[1] = new Pizza("sicilian", "traditional",
                "small", 20);
        pizzas[2] = neapolitan;

        salad.addIngredients("romaine lettuce");
        salad.addIngredients("garlicky croutons");
        salad.addIngredients("olive oil");
        salad.addIngredients("worcestershire sauce");
        salad.addIngredients("parmesan");
        salad.showIngredients();
    }
}