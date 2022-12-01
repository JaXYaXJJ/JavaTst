package Thread.colors;

public class Countdown {

    public void doCountdown() {

        String color;

        switch (Thread.currentThread().getName()) {

            case "Thread-0" -> color = Colors.PURPLE;
            case "Thread-1" -> color = Colors.BLUE;
            default -> color = Colors.YELLOW;

        }

        for (int i=10; i>0; i--) {

            System.out.println(color + Thread.currentThread().getName() + ": i = " + i);

        }
    }

    public void run() {
        doCountdown();
    }
}
