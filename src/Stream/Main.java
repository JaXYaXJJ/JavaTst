package Stream;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Stream Pipeline

        //Filtering -> Stream()
        //Transformation X >> Y -> Stream()
        //Grouping -> Stream()

        ArrayList<String> plates = new ArrayList<>();

        plates.add("FREAc34K");
        plates.add("FxcVE34K");
        plates.add("FY3fb94R");
        plates.add("RTeMCM46");
        plates.add("XOOC0P8K");
        plates.add("ZZEaC66L");
        plates.add("XEEps98H");
        plates.add("AcEE3o11");

        //Lazy Operations

        plates.stream()
                .map(String::toUpperCase)
                .filter(plate -> plate.contains("AC")) //lambda
                .map(Main::changeSuffix)
                .sorted()
                .forEach(System.out::println); //Performs an action for each element of this stream. This is a terminal operation.

        /*

        Effectively final

        ArrayList<String> filteredValues = new ArrayList<>();

        plates.forEach((plate) -> {
            if (plate.toUpperCase().contains("AC"))
                filteredValues.add(plate);
        });

        filteredValues.sort( (p1, p2) -> { return p1.compareTo(p2);});

        filteredValues.forEach(System.out::println);

        filteredValues.forEach(Main::changeSuffix);

         */
    }

    private static String changeSuffix(String plate) {
        return plate + "2022";
    }
}
