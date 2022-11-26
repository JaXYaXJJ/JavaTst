package Stream.streamExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

//        List<Integer> collection = new ArrayList<>();
//
//        collection.add(5);
//        collection.add(250);
//        collection.add(55);
//        collection.add(50);
//        collection.add(100);
//
//        collection = collection.stream()
//                .filter(integer -> integer % 2 == 0)
//                .map((integer -> integer * 100))
//                .sorted()
//                .toList();
//
//        System.out.println(collection);

        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person("UK", "Robby", 26));
        personArrayList.add(new Person("IL", "Noah", 29));
        personArrayList.add(new Person("US", "Lisa", 25));
        personArrayList.add(new Person("UK", "Sandra", 30));
        personArrayList.add(new Person("IL", "Shachar", 31));
        personArrayList.add(new Person("IL", "Noa", 22));
        personArrayList.add(new Person("UK", "John", 24));
        personArrayList.add(new Person("US", "Mike", 30));

        Map<String, List<Person>> groupedByLocality = personArrayList.stream()
//                .collect(Collectors.groupingBy((person -> person.getLocality())));
                .collect(Collectors.groupingBy(Person::getLocality));

        System.out.println(groupedByLocality);
    }

    public static <T> Collection<T> print(Collection<T> collection) {
        for (T element : collection)
            System.out.println(element);
        return collection;
    }
}
