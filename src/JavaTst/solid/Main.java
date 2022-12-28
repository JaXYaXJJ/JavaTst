package JavaTst.solid;

public class Main {
    public static void main(String[] args) {

        //SOLID is an acronym for five other class-design principles:
        // Single Responsibility Principle,
        // Open-Closed Principle,
        // Liskov Substitution Principle,
        // Interface Segregation Principle,
        // and SOLID.Dependency Inversion Principle.

        Computer comp = new Computer("IBM XT", 80000);

        ISaveInterface saver = new SaveComputerToFile();
        saver.save("out.data", comp);

        ISaveInterface saverTwo = new SaveComputerToDB();

    }
}
