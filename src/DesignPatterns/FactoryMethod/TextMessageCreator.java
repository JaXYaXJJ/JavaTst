package DesignPatterns.FactoryMethod;

public class TextMessageCreator extends MessageCreator{
    @Override
    protected Message createMessage() {
        return new TextMessage();
    }
}
