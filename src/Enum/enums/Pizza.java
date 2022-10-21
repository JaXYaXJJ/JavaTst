package Enum.enums;

public class Pizza {

    protected Size pizzaSize;

    public Pizza(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void orderPizza() {

        switch (this.pizzaSize) {
            case SMALL: System.out.println("Small");
            case MEDIUM: System.out.println("Medium");
            case LARGE: System.out.println("Large");
            case EXTRA_LARGE: System.out.println("Extra large");
        }
    }
}
