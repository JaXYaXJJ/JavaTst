package JavaTst.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection<Integer> nums = new ArrayList<>();
        List<String> strs = new LinkedList<>();
        Collection<String> queue = new PriorityQueue<>();


        Collections.sort(strs);


        Set<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        set.add(5);


        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(45);
        treeSet.add(125);
        treeSet.add(15);


        Set<Person> treeSetTwo = new TreeSet<>();

        treeSetTwo.add(new Person("Mike", 30));
        treeSetTwo.add(new Person("Ford", 39));
        treeSetTwo.add(new Person("Sean", 27));


        ArrayList<String> strings = new ArrayList<>();

        strings.add("A");
        strings.add("B");
        strings.add("C");

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(2);
        ints.add(3);

        Collection<String> myString = print(strings);
        Collection<Integer> myInts = print(ints);
    }

    public static <T> Collection<T> print(Collection<T> collection) {
        for (T element : collection)
            System.out.println(element);
        return collection;
    }
}
