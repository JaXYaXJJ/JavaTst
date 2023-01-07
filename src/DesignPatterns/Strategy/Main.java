package DesignPatterns.Strategy;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(new CreditCardStrategy());

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",50);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.pay();

        cart.setStrategy(new PaypalStrategy());
        cart.pay();
    }
}
