package DesignPatterns.Observer.nadavEx;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Subject<String> {

    private List<Observer<String>> subscribes;
    private String headLineOfTheDay;

    public Magazine() {
        subscribes = new ArrayList<>();
    }

    public String getHeadLineOfTheDay() {
        return headLineOfTheDay;
    }

    public void setHeadLineOfTheDay(String headLineOfTheDay) {
        this.headLineOfTheDay = headLineOfTheDay;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer<String> o : subscribes)
            o.update(headLineOfTheDay);
    }

    @Override
    public void addListener(Observer<String> observer) {
        subscribes.add(observer);
    }

    @Override
    public void removeListener(Observer<String> observer) {
        subscribes.remove(observer);
    }
}
