package DesignPatterns.AbstractFactory.nadavEx.factories;

import DesignPatterns.AbstractFactory.nadavEx.pizzas.CheesePizza;
import DesignPatterns.AbstractFactory.nadavEx.pizzas.ClamPizza;
import DesignPatterns.AbstractFactory.nadavEx.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        PizzaIngredientFactory ingredientFactory = new NYStyleIngredientFactory();
        Pizza pizza;
        if(type.equals("clams")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else {
            pizza = new CheesePizza(ingredientFactory);
        }
        pizza.prepare();
        pizza.bake();
        return pizza;
    }
}