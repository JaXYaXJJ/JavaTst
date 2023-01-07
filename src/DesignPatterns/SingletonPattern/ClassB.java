package DesignPatterns.SingletonPattern;

public class ClassB {

    public ClassB() {
        LazySingleton.getInstance();
    }
}
