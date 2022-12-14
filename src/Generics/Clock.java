package Generics;

public class Clock<T> implements ICalendar<T> {

    private T date;

    @Override
    public void setDate(T date) {
        this.date = date;
    }

    @Override
    public T getDate() {
        return this.date;
    }
}
