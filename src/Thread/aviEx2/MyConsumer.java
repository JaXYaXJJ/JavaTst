package Thread.aviEx2;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MyConsumer implements Runnable {

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyConsumer(ReentrantLock bufferLock, List<String> buffer, String color) {
        this.bufferLock = bufferLock;
        this.buffer = buffer;
        this.color = color;
    }

//    public void runTwice() {
//        run();
//    }

    @Override
    public void run() {

//        if (bufferLock.tryLock()) ex. for tryLock() method
        int counter = 0;

        while (true) {
            if (bufferLock.tryLock()) {

//            synchronized (buffer) {
//                bufferLock.lock();

//                runTwice();

                try {
                    if (buffer.isEmpty()) {
//                    bufferLock.unlock();
                        continue;
                    }

                    System.out.println(color + "Counter: " + counter);

                    if (buffer.get(0).equals("EOF")) {
                        System.out.println(color + "Exiting...");
//                    bufferLock.unlock();
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.remove(0));
                    }
                } finally {
                    bufferLock.unlock();
                }
//            }
            }
            else
                counter++;
        }
    }
}
