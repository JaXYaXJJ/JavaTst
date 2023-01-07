package DesignPatterns.SingletonPattern;

public class Main {
    public static void main(String[] args) {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();

        System.out.println(lazySingleton == lazySingleton2);
    }
}
