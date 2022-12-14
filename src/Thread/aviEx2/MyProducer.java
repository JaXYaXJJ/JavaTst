package Thread.aviEx2;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer implements Runnable {

    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public MyProducer(ReentrantLock bufferLock, List<String> buffer, String color) {
        this.bufferLock = bufferLock;
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {

        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            System.out.println(color + "Adding..." + num);

//            synchronized (buffer) {
            bufferLock.lock();

                buffer.add(num);
                bufferLock.unlock();
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(color + "Adding EOF and exiting...");

//        synchronized (buffer) {
        bufferLock.lock();

            buffer.add("EOF");
            bufferLock.unlock();
//        }
    }
}
