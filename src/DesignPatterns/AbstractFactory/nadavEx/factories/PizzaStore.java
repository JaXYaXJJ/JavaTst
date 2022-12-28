package DesignPatterns.AbstractFactory.nadavEx.factories;

import DesignPatterns.AbstractFactory.nadavEx.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
