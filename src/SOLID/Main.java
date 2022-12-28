package SOLID;

public class Main {
    public static void main(String[] args) {

        //SOLID is an acronym for five other class-design principles:
        // Single Responsibility Principle,
        // Open-Closed Principle,
        // Liskov Substitution Principle,
        // Interface Segregation Principle,
        // and SOLID.Dependency Inversion Principle.

        TextManipulator textManipulator = new TextManipulator(
                "This is a Java course"
        );

        TextPrinter textPrinter = new TextPrinter(textManipulator);

        textManipulator.appendText("\nThis text was appended");
        textManipulator.findWordAndReplace("Java", "Python");

        textPrinter.printText();
        textPrinter.printOutEachWord();
    }
}
