package JavaTst.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> tstList = new ArrayList<>();

        tstList.add("Oslo");
        tstList.add("Bergen");
        tstList.add("Tromso");
        tstList.add("Bodo ");

        Iterator<String> iterator = tstList.iterator();
        while (iterator.hasNext()) {
        String norwayCity = iterator.next();
        System.out.println("Norway: " + norwayCity);

        if (norwayCity == "Bergen")
            tstList.remove(norwayCity);
        }
    }
}
