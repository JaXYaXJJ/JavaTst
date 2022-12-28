package DesignPatterns.BuilderPattern.aviEx2;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder("Large")
                .setWithExtraCheese(true)
                .setWithOnion(true)
                .build();

        System.out.println(pizza);
    }
}
