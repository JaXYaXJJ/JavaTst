package HomeWork.stream;

import java.util.*;
import java.util.stream.Collectors;

public class hwStream {

    public static void main(String[] args) {

        Person roni = new Person("Roni", 81, "Israel");
        Person sara = new Person("Sara", 4, "USA");
        Person viktor = new Person("Viktor", 13, "Israel");
        Person michael = new Person("Michael", 41, "Norway");

        List<Person> collection = Arrays.asList(
                roni, sara, viktor, michael);

//        getKidNames(collection).forEach(System.out::println);

        getKidNames(collection);
        groupByCountry(collection);

    }

    /*
    public static Set<String> getKidNames(List<Person> people) {

        Set<String> kids = new HashSet<>();

        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }
     */

    public static void getKidNames(List<Person> people) {

        List<Person> personList = people.stream()
                .filter(person -> person.getAge() < 18)
                .collect(Collectors.toList());

        System.out.println("Kids names: " + personList);
    }

    public static void groupByCountry(List<Person> people) {

        Map<String, List<Person>> map = people.stream()
                .collect(Collectors.groupingBy(Person::getCountry));
        System.out.println(map);
    }
}
