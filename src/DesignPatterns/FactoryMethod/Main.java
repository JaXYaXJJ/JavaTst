package DesignPatterns.FactoryMethod;

public class Main {

    public static void printMessage(MessageCreator creator) {

        Message msg = creator.getMessage();
        System.out.println(msg);
    }

    public static void main(String[] args) {

        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
    }
}
