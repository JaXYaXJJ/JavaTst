package DesignPatterns.Observer.aviEx;

public class Main {
    public static void main(String[] args) {

        Channel foodies = new Channel("Foodies");
        Channel kan11 = new Channel("Kan11");

        Subscriber roni = new Subscriber("Roni");
        Subscriber hen = new Subscriber("Hen");

        foodies.subscribe(roni);
        foodies.subscribe(hen);

        kan11.subscribe(roni);

        foodies.uploadVideo("Observer design pattern explained!");
        kan11.uploadVideo("Apologize for a question");
    }
}
