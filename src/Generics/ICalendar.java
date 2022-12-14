package Generics;

public interface ICalendar<T> {

    void setDate(T date);
    T getDate();
}
