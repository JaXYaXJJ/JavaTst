package DesignPatterns.Observer.nadavEx;

public interface Subject<T> {

    void notifyObservers();

    void addListener(Observer<T> observer);

    void removeListener(Observer<T> observer);
}
