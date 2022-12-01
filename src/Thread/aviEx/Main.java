package Thread.aviEx;

public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread());

        Thread t1 = new Thread(new Printer());
        Thread t2 = new Thread(new Looper());

        t1.setName("Printer");
        t2.setName("Looper");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("This LINE after join method was called!");
        System.out.println("We R inside main method!");
    }
}
