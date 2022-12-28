package DesignPatterns.AbstractFactory.nadavEx.pizzas;

import DesignPatterns.AbstractFactory.nadavEx.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory factory;
    public ClamPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        dough = factory.createDough();
        sauce = factory.createSauce();
        clams = factory.createClams();
    }
}
