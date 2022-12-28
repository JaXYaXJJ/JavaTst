package HomeWork.designPatterns;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new PizzaBuilder("Large")
                .onion()
                .cheese()
                .build();

        System.out.println(pizza);

    }
}
