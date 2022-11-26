package JavaTst.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList<Integer> myList = new MyList();
        MyList<String> myListString = new MyList();


        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();


        Pair<String, Integer> pair = new Pair<>("One", 2);

        Pair<List<String>, List<Integer>> listPair =
                new Pair<>(new ArrayList<>(), new ArrayList<>());


        String someString = doStuff("str");
        Integer someInt = doStuff(20);
        double someDbl = doStuff(20.5);
        float someFlt = doStuff(20.5f);
    }

    public static <T> T doStuff(T anyType) {
//        System.out.println(anyType);

        return (T) new Object();
    }

}
