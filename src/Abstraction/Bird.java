package Abstraction;

public class Bird extends Animal {

    public Bird(String name, int numOfLegs, String color) {
        super(name, numOfLegs, color);
    }

    @Override
    protected void makeNoise() {
        System.out.println("I am making some Bird sound...");
    }
}
