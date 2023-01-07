package JavaTst.designPatterns.decorator;

public class ShreddedMexicanCheese extends ToppingDecorator {

    public ShreddedMexicanCheese(ITaco taco) {
        super(taco);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + ", shredded mexican cheese";
    }
    @Override
    public double getCost() {
        return taco.getCost() + 5.5;
    }
}
