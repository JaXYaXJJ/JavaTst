package ClassWork.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Iain", "Eve", "Irene"};
        List<String> nameList = Arrays.asList(names);
        //asList: returns a fixed-size list
        //.add("Name") -> error

        System.out.println(nameList);
        System.out.println(names);
        System.out.println(Arrays.toString(names));

        nameList = new ArrayList<>(Arrays.asList(names));
        //from asList to ArrayList

        someMethod(1, 2, 3, 4, 5);
        //t...args

        List<String> varArgs = Arrays.asList("var", "args", "example");

        Arrays.sort(names);

        int[] intArray = {25, 43, 21, 2};
        Arrays.sort(intArray);
    }

    private static void someMethod(int... args) {

        args[0] = 100;
        System.out.println(Arrays.toString(args));
    }
}
