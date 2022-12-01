package Thread.aviEx;

public class Looper implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
