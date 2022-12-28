package DesignPatterns.BuilderPattern.nadavEx.ex2;

import java.util.ArrayList;

public class Pizza {

    //required parameters
    private String size;

    //optional parameters
    private ArrayList<Topping> toppings;

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    private Pizza(Builder builder) {

        this.size = builder.size;
        this.toppings = builder.toppings;
    }


    static class Builder implements IToppings, IBuild {

        private String size;
        private ArrayList<Topping> toppings;

        public Builder(String size) {

            this.size = size;
            this.toppings = new ArrayList<>();
        }

        @Override
        public Builder addExtraCheese() {
            toppings.add(
                    new Topping("Extra Cheese"));
            return this;
        }

        @Override
        public Builder addGoatCheese() {
            toppings.add(
                    new Topping("Goat Cheese"));
            return this;
        }

        @Override
        public Builder addManchegoCheese() {
            toppings.add(
                    new Topping("Manchego Cheese"));
            return this;
        }

        @Override
        public Builder addTomato() {
            toppings.add(
                    new Topping("Tomato"));
            return this;
        }

        @Override
        public Builder addOnion() {
            toppings.add(
                    new Topping("Onion"));
            return this;
        }

        @Override
        public Builder addOlives() {
            toppings.add(
                    new Topping("Olives"));
            return this;
        }

        @Override
        public Builder addMushrooms() {
            toppings.add(
                    new Topping("Mushrooms"));
            return this;
        }

        @Override
        public Builder addAnchovy() {
            toppings.add(
                    new Topping("Anchovy"));
            return this;
        }

        @Override
        public Builder addBasil() {
            toppings.add(
                    new Topping("Basil"));
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
