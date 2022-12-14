package Generics;

public class Main {
    public static void main(String[] args) {

        ICalendar<String> clockString = new Clock<>();

        clockString.setDate("Nov 2022");

        System.out.println(clockString.getDate());
    }
}
