package JavaTst.designPatterns.decorator;

public class Jalapeno extends ToppingDecorator {

    public Jalapeno(ITaco taco) {
        super(taco);
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + ", jalapeno";
    }
    @Override
    public double getCost() {
        return taco.getCost() + 2.0;
    }
}
