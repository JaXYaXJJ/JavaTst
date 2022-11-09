package ClassWork.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>(){{
            add(4); add(8); add(2);
        }};

        Iterator<Integer> iterator = integerList.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println("Element " + element);

            if (element == 2)
                integerList.remove(element);
        }

//        System.out.println(integerList);

//        integerList.forEach(System.out::println);
    }
}
