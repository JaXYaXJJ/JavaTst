package DesignPatterns.Adapter;

public class Duck implements Quackable {

    void fly() {
        System.out.println("FLY!");
    }

    public void quack() {
        System.out.println("Quack!");
    }
}
