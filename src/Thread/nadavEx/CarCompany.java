package Thread.nadavEx;

import java.util.ArrayList;
import java.util.List;

public class CarCompany extends Thread {

    private int id;
    public CarCompany(int id) {
        this.id = id;
    }

    List<IEngine> engineList = new ArrayList<>();

    public void consumeEngine(IEngine engine) {
        engineList.add(engine);
    }

    @Override
    public String toString() {
        return "Company: " + id;
    }

    //    @Override
//    public void run() {
//        super.run();
//    }
}
