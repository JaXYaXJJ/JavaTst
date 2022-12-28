package HomeWork.designPatterns;

public class PizzaBuilder {

    String size;

    boolean olives;
    boolean onion;
    boolean cheese;
    boolean tomato;
    boolean tuna;


    public PizzaBuilder(String size) {

        this.size = size;
    }

    public PizzaBuilder olives() {
        this.olives = true;
        return this;
    }

    public PizzaBuilder onion() {
        this.onion = true;
        return this;
    }

    public PizzaBuilder cheese() {
        this.cheese = true;
        return this;
    }

    public PizzaBuilder tomato() {
        this.tomato = true;
        return this;
    }

    public PizzaBuilder tuna() {
        this.tuna = true;
        return this;
    }

    public Pizza build() {

        return new Pizza(this);
    }
}
