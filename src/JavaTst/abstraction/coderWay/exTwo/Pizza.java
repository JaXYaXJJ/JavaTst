package JavaTst.abstraction.coderWay.exTwo;

public class Pizza extends Recipes {

    String size;

    public void showIngredients(){}
    public void showRecipes() {}

    Pizza (String dishName, String type, String pizzaSize, int timeToCook) {
        this.dishName = dishName;
        this.type = type;
        this.size = pizzaSize;
        //int time from Salad class
    }
}
