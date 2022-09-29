package Abstraction;

public class Cat extends Animal {

    public Cat(String name, int numOfLegs, String color) {
        super(name, numOfLegs, color);
    }

    @Override
    protected void makeNoise() {
        System.out.println("I am making some Cat sound...");
    }
}
