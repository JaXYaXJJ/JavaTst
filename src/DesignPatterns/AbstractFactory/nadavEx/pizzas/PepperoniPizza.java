package DesignPatterns.AbstractFactory.nadavEx.pizzas;

import DesignPatterns.AbstractFactory.nadavEx.factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory factory;
    public PepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing pizza...");
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
