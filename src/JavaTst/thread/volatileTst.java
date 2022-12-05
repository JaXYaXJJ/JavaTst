package JavaTst.thread;

public class volatileTst {

    volatile static int num = 1;

    public static void main(String[] args) {

        new MyThreadWrite().start();
        new MyThreadRead().start();
    }

    static class MyThreadWrite extends Thread {
        @Override
        public void run() {
            while (num <= 5) {
                System.out.println("increment num to " + (num++));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localNum = num;
            while (localNum <= 5) {
                if (localNum != num) {
                    System.out.println("new value of num is " + num);
                    localNum = num;
                }
            }
        }
    }
}
