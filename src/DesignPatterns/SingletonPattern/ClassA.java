package DesignPatterns.SingletonPattern;

public class ClassA {

    public ClassA() {
        LazySingleton.getInstance();
    }
}
