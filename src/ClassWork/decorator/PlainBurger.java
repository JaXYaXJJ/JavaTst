package ClassWork.decorator;

public class PlainBurger implements Burger {
    @Override
    public String getDescription() {
        return "Plan Burger 250g";
    }
    @Override
    public double getCost() {
        return 40.0;
    }
}
