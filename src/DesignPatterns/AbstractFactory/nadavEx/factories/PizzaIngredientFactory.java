package DesignPatterns.AbstractFactory.nadavEx.factories;

import DesignPatterns.AbstractFactory.nadavEx.ingredients.Clams;
import DesignPatterns.AbstractFactory.nadavEx.ingredients.Dough;
import DesignPatterns.AbstractFactory.nadavEx.ingredients.Sauce;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clams createClams();
}