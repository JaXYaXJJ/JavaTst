package SOLID;

import java.util.Arrays;

public class TextPrinter {

    protected TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWord() {
        System.out.println(Arrays.toString(
                textManipulator.getText().split(" ")
        ));
    }
}
