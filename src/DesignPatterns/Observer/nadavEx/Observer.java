package DesignPatterns.Observer.nadavEx;

public interface Observer<T> {

    void update(T value);

    void subscribe(Subject<T> subject);

    void unsubscribe(Subject<T> subject);
}
