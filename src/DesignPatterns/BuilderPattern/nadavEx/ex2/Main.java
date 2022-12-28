package DesignPatterns.BuilderPattern.nadavEx.ex2;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.Builder("Large")
                .addAnchovy()
                .addMushrooms()
                .addBasil()
                .addManchegoCheese()
                .build();

        System.out.println(pizza);
    }
}
