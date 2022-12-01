package Thread.nadavEx;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        BMW bmw = new BMW();

        Timer companiesTimer = new Timer();
        companiesTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                CarCompany company = new CarCompany(
                        (int)(Math.random()*1000));
                bmw.byEngine(company);
            }
        }, 0,10000);
    }
}
