package ClassWork.decorator;

public class Tomato extends ToppingDecorator {
    public Tomato(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + ", tomato";
    }
    @Override
    public double getCost() {
        return burger.getCost();
    }
}
