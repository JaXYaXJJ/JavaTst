package DesignPatterns.FactoryMethod;

public abstract class MessageCreator {

    protected abstract Message createMessage();

    public Message getMessage() {

        Message msg = createMessage();
        msg.encrypt();
        return msg;
    }
}
