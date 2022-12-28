package DesignPatterns.AbstractFactory.nadavEx.pizzas;

import DesignPatterns.AbstractFactory.nadavEx.ingredients.Clams;
import DesignPatterns.AbstractFactory.nadavEx.ingredients.Dough;
import DesignPatterns.AbstractFactory.nadavEx.ingredients.Sauce;

public abstract class Pizza {
    protected Dough dough;
    protected Sauce sauce;
    protected Clams clams;
    public abstract void prepare();
    public void bake() {
        System.out.println("Baking a pizza");
    }
    public void cut() {
        System.out.println("Cutting a pizza");
    }
    public void box() {
        System.out.println("Boxing a pizza");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough=" + dough +
                ", sauce=" + sauce +
                ", clams=" + clams +
                '}';
    }
}
