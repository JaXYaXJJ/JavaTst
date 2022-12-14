package JavaTst.thread.executorService;

//execute(), submit(), invokeAll(), invokeAny()

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Starter {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(10);

//        List<Future<Long>> tasks = new ArrayList<>();
        List<MyCallable> tasks = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            MyCallable mc = new MyCallable();
//            Future<Long> submit = es.submit(mc);
//            tasks.add(submit);
            tasks.add(mc);
        }
//        for(Future<Long> f : tasks) {
//            f.get();
//        }

//        List<Future<Long>> futures = es.invokeAll(tasks);
        Long aLong  = es.invokeAny(tasks);
//        for(Future<Long> f : futures) {
            System.out.println(aLong);
//        }

        System.out.println("FINISH");
        es.shutdown();
    }
}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        System.out.println("Started:" + Thread.currentThread().getId());
        Thread.sleep(1000 + Math.round(Math.random() * 5000));
        System.out.println("Finished:" + Thread.currentThread().getId());
        return Thread.currentThread().getId();
    }
}
