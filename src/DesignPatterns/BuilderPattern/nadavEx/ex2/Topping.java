package DesignPatterns.BuilderPattern.nadavEx.ex2;

public class Topping {

    String name;

    public String getName() {
        return name;
    }

    public Topping(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
