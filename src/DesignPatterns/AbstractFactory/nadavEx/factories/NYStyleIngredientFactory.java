package DesignPatterns.AbstractFactory.nadavEx.factories;

import DesignPatterns.AbstractFactory.nadavEx.ingredients.*;

public class NYStyleIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}