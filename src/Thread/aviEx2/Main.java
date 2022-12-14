package Thread.aviEx2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        //Producer - to generate values into a buffer
        List<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

//        bufferLock.lock();
//        //Critical Code
//        bufferLock.unlock();

        MyProducer producer = new MyProducer(bufferLock, buffer, Colors.BLUE);

        MyConsumer consumerOne = new MyConsumer(bufferLock, buffer, Colors.PURPLE);
        MyConsumer consumerTwo = new MyConsumer(bufferLock, buffer, Colors.GREEN);

        executorService.execute(producer);
        executorService.execute(consumerOne);
        executorService.execute(consumerTwo);

        Future<String> future = executorService.submit(
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        System.out.println("I'm being printed from call method!");
                        return "Callable results!";
                    }
                });
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
