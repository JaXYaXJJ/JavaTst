package JavaTst.thread;

public class threadTst {
    public static void main(String[] args) {

        new MyThread().start();
        try {
            MyThread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        new MyThread().start();

        new MyThread().start();
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            super.run();
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread name is " + Thread.currentThread().getName() + " i=" + i);
            }
        }
    }
}
