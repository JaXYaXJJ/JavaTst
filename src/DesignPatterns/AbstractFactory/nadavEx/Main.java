package DesignPatterns.AbstractFactory.nadavEx;

import DesignPatterns.AbstractFactory.nadavEx.factories.ChicagoStylePizzaStore;
import DesignPatterns.AbstractFactory.nadavEx.factories.NYStylePizzaStore;
import DesignPatterns.AbstractFactory.nadavEx.factories.PizzaStore;
import DesignPatterns.AbstractFactory.nadavEx.pizzas.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String state = null;
        Pizza pizza;
        String type;

        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        Scanner scanner = new Scanner(System.in);

        while (!"exit".equals(state)) {
            System.out.println("Enter pizza style");
            state = scanner.nextLine();

            switch (state) {
                case "NY" -> pizzaStore = new NYStylePizzaStore();
                case "Chicago" -> pizzaStore = new ChicagoStylePizzaStore();
                default -> { continue; }
            }
            System.out.println("Enter pizza type");
            type = scanner.nextLine();

            while (!isValidPizzaType(type)) {
                System.out.println(type + " is not valid, enter pizza type");
                type = scanner.nextLine();
            }
            pizza = pizzaStore.orderPizza(type);

            System.out.println(pizza);
        }
    }

    public static boolean isValidPizzaType(String type) {
        return type.equals("cheese")
                || type.equals("pepperoni")
                || type.equals("clams")
                || type.equals("greek")
                || type.equals("veggie");
    }
}
