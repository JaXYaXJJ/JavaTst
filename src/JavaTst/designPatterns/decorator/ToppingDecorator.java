package JavaTst.designPatterns.decorator;

public abstract class ToppingDecorator implements ITaco {
    protected ITaco taco;
    public ToppingDecorator(ITaco taco) {
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription();
    }
    @Override
    public double getCost() {
        return taco.getCost();
    }
}
