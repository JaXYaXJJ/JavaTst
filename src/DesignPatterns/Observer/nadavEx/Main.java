package DesignPatterns.Observer.nadavEx;

public class Main {
    public static void main(String[] args) {

        User ronny = new User("ronny");
        User rita = new User("rita");

        Magazine yediotAhrounot = new Magazine();
        yediotAhrounot.addListener(ronny);

        rita.subscribe(yediotAhrounot);

        yediotAhrounot.setHeadLineOfTheDay("Today I lost 300 shekels!");

        yediotAhrounot.setHeadLineOfTheDay("Today I earned 15,000 shekels!");

        rita.unsubscribe(yediotAhrounot);

        yediotAhrounot.setHeadLineOfTheDay("We won the lottery!");
    }
}
