package ClassWork.arrayList;

import java.util.*;

public class Languages {
    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("--- Iterate using Java 8 forEach and Lambda ---");

        programmingLanguages.forEach( language -> System.out.println(language));

        System.out.println("\n");

        for (String language: programmingLanguages) {
            System.out.println(language);
        }

        System.out.println("\n");

        List<Integer> nums = new ArrayList<>();

        nums.add(0);
        nums.add(3);
        nums.add(7);
        nums.add(17);
        nums.add(4);
        nums.add(1);

        nums.forEach( num -> System.out.println(num * 2) );

//        nums.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        }); // anonymous class java

        nums.sort( (numberOne, numberTwo) -> numberOne - numberTwo); //lambda
        System.out.println(nums);
    }
}
