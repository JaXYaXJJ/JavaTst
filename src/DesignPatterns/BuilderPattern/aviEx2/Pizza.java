package DesignPatterns.BuilderPattern.aviEx2;

public class Pizza {
    private String size;
    private boolean olives;
    private boolean onion;
    private boolean extraCheese;

    //Getters
    public String getSize() {
        return size;
    }

    public boolean isOlives() {
        return olives;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    //Private Setters

    private void setSize(String size) {

        this.size = size;
    }

    private void setOlives(boolean olives) {

        this.olives = olives;
    }

    private void setOnion(boolean onion) {

        this.onion = onion;
    }

    private void setExtraCheese(boolean extraCheese) {

        this.extraCheese = extraCheese;
    }

    //Inner Class
    //outerclass.innerclass.staticVariable
    public static class PizzaBuilder {
        private String size;
        private boolean withOlives;
        private boolean withOnion;
        private boolean withExtraCheese;

        public PizzaBuilder(String size) {

            this.size = size;
        }

        public PizzaBuilder setWithOlives(boolean withOlives) {

            this.withOlives = withOlives;
            return this;
        }

        public PizzaBuilder setWithOnion(boolean withOnion) {

            this.withOnion = withOnion;
            return this;
        }

        public PizzaBuilder setWithExtraCheese(boolean withExtraCheese) {

            this.withExtraCheese = withExtraCheese;
            return this;
        }

        public Pizza build() {

            Pizza pizza = new Pizza();

            pizza.setSize(size);
            pizza.setOlives(withOlives);
            pizza.setOnion(withOnion);
            pizza.setExtraCheese(withExtraCheese);

            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", olives=" + olives +
                ", onion=" + onion +
                ", extraCheese=" + extraCheese +
                '}';
    }
}
