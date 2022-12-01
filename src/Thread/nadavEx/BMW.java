package Thread.nadavEx;

import java.util.*;

public class BMW {

    private List<IEngine> engineList = new ArrayList<>();
    private Object lock = new Object();
    Queue<CarCompany> companyQueue = new LinkedList<>();

    public BMW() {

//        Thread createEnginesThread = new Thread( ()-> {
//            // in another thread
//        });
//        //
//        createEnginesThread.start();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // 50%
                if (Math.random() * 100 <= 50)
                    engineList.add(new ElectricEngine());
                else
                    engineList.add(new OilEngine());
                System.out.println("BMW provided a new engine!");
                System.out.println("Notifying waiting companies!");
                synchronized (lock) {
                    lock.notify();
                }
            }
        }, 1000, 14000);
    }

    public void byEngine(CarCompany company) {
        System.out.println("Waiting companies: " + companyQueue);
        companyQueue.add(company);
        synchronized (lock) {
            if (engineList.isEmpty())
                System.out.println(company + " waiting for an engine...!");

            while (engineList.isEmpty()) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            company.consumeEngine(engineList.remove(0));
            System.out.println(company + " consumed engine!");
            companyQueue.remove(company);
        }
    }
}