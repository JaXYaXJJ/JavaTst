package DesignPatterns.Decorator;

public class Main {

    public static void main(String[] args) {

        Message decorator = new Base64EncodedMessage(
                new HtmlEncodedMessage(
                        new TextMessage("<Msg> with Base64 and HTML decode!")));

        System.out.println(decorator.getContent());
    }
}
