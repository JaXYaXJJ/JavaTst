package JavaTst.abstraction;

public class Main {
    public static void main(String[] args) {

        Car carOne = new ToyotaCorolla();
        Car carTwo = new ToyotaCamry();

        carOne.draw();
        carTwo.draw();
    }
}
