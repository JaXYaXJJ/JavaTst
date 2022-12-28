package HomeWork.designPatterns;

public class Pizza {

    private String size; //mandatory
    private boolean olives; //optional
    private boolean onion; //optional
    private boolean cheese; //optional
    private boolean tomato; //optional
    private boolean tuna; //optional


    Pizza(PizzaBuilder builder) {

        size = builder.size;
        olives = builder.olives;
        onion = builder.onion;
        cheese = builder.cheese;
        tomato = builder.tomato;
        tuna = builder.tuna;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", olives=" + olives +
                ", onion=" + onion +
                ", cheese=" + cheese +
                ", tomato=" + tomato +
                ", tuna=" + tuna +
                '}';
    }
}
