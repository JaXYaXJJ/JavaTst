package DesignPatterns.SingletonPattern;

public class EagerSingleton {

    private String name;
    private EagerSingleton(){}

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
