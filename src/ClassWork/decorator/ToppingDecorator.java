package ClassWork.decorator;

public abstract class ToppingDecorator implements Burger {
    protected Burger burger;
    public ToppingDecorator(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String getDescription() {
        return burger.getDescription();
    }
    @Override
    public double getCost() {
        return burger.getCost();
    }

    public static void main(String[] args) {

        Burger planBurger = new Onion(new Tomato(new PlainBurger()));
        System.out.println(planBurger.getDescription());
    }
}
