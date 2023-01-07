package ClassWork.decorator;

public class Onion extends ToppingDecorator {
    public Onion(Burger burger) {
        super(burger);
    }
    @Override
    public String getDescription() {
        return burger.getDescription() + ", onion";
    }
    @Override
    public double getCost() {
        return burger.getCost();
    }
}
