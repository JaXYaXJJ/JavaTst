package DesignPatterns.Observer.nadavEx;

public class User implements Observer<String> {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String value) {
        System.out.println(this + " has received a magazine headline! " + value);
    }

    @Override
    public void subscribe(Subject<String> subject) {
        subject.addListener(this);
    }

    @Override
    public void unsubscribe(Subject<String> subject) {
        subject.removeListener(this);
    }

    @Override
    public String toString() {
        return userName;
    }
}
