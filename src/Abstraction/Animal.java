package Abstraction;

public abstract class Animal {

    protected String name;
    protected int numOfLegs;
    protected String color;

    public Animal(String name, int numOfLegs, String color) {
        this.name = name;
        this.numOfLegs = numOfLegs;
        this.color = color;
    }

    protected abstract void makeNoise();

    @Override
    public String toString() {
        return this.name + " with " + this.numOfLegs + " legs, in " + this.color + " color";
    }
}

