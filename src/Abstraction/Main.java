package Abstraction;

public class Main {

    public static void main(String[] args) {

        Animal kitty = new Cat("Kitty", 4, "Gray");
        Animal twitti = new Bird("Twitti", 2, "Yellow");

        kitty.makeNoise();
        twitti.makeNoise();

        System.out.println("\n");

        System.out.println(kitty);
        System.out.println(twitti);

    }
}
