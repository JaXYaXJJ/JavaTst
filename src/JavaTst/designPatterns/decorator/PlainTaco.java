package JavaTst.designPatterns.decorator;

public class PlainTaco implements ITaco {

    @Override
    public String getDescription() {
        return "Basic taco with standard home toppings";
    }

    @Override
    public double getCost() {
        return 38.0;
    }


    public static void main(String[] args) {

        ITaco plainTaco = new Jalapeno(new ShreddedMexicanCheese(new PlainTaco()));
        System.out.println(plainTaco.getDescription());
        System.out.println(plainTaco.getCost());
    }
}
