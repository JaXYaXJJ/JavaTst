package DesignPatterns.AbstractFactory.nadavEx.factories;

import DesignPatterns.AbstractFactory.nadavEx.ingredients.*;

public class ChicagoStyleIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
    @Override
    public Sauce createSauce() {
        return new HotSauce();
    }
    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}