package DesignPatterns.AbstractFactory.nadavEx.pizzas;

import DesignPatterns.AbstractFactory.nadavEx.factories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory factory;
    public VeggiePizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
