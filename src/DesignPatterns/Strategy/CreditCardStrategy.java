package DesignPatterns.Strategy;

public class CreditCardStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Credit Card!");
    }
}
