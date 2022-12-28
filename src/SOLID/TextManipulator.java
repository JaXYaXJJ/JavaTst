package SOLID;

//SRP

public class TextManipulator {

    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public void appendText(String newText) {
        this.text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {

        if (text.contains(word))
            text = text.replace(word, replacementWord);

        return text;
    }

    public String getText() {
        return text;
    }
}
