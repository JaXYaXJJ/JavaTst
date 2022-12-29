package DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args) {

        Swan swan = new Swan();
        Quackable duck = new Duck();

        Quackable swanQ = new SwanAdapter(swan);
        swanQ.quack();
    }
}
