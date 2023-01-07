package DesignPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private List<Item> items;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculateTotal() {

        int sum = 0;

        for (Item item : items)
            sum += item.getPrice();

        return sum;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void pay() {
        paymentStrategy.pay(calculateTotal());
    }
}
