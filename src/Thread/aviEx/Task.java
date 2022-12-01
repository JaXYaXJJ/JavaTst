package Thread.aviEx;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {

    @Override
    public void run() {

        System.out.println("I'm inside the RUN method!");

        innerMethod();
        anotherInnerMethod();
    }

    private void innerMethod() {
        System.out.println("I'M INNER METHOD!");
    }

    private void anotherInnerMethod() {
        System.out.println("I'M OTHER INNER METHOD!");
    }


    public static void main(String[] args) {

        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

        try {
//            Thread.sleep(3000);
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        SecondThread secondThread = new SecondThread();
        Thread thread2 = new Thread(secondThread);
        thread2.start();

        System.out.println("Inside MAIN...!");
    }
}
