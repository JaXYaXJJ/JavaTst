package DesignPatterns.AbstractFactory.nadavEx.pizzas;

import DesignPatterns.AbstractFactory.nadavEx.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory factory;
    public CheesePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
