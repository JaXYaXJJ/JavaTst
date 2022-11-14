package ClassWork.aviStream;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args) throws IOException {

        Person roni = new Person("Roni",81,"Israel");
        Person sara = new Person("Sara",4, "USA");
        Person viktor = new Person("Viktor",12,"Israel");
        Person michal = new Person("Michal",42,"Israel");

        List<Person> kids = Arrays.asList(roni,sara,viktor,michal);

        Map<String,List<Person>> map = groupByCountry(kids);

        Set<String> countries = map.keySet();

        for (String country : countries)
            System.out.println("Country is : " + country + " List of people : " + map.get(country));


        System.out.println(
                getIntegerString(Arrays.asList(2,5,3,6,7))
        );
    }


    /**
     *
     * @param list
     * Concat list of integers separated by commas
     */
    public static String getIntegerString(List<Integer> list) {

        return list.stream()
                .map((num) -> num % 2 == 0 ? "e" + num : "o" + num)
                .collect(Collectors.joining(","));
    }


    /**
     *
     * @param people
     * Returning Map<String,List<Person>> where key = country and value = list of peoples belong to that country
     */
    public static Map<String,List<Person>> groupByCountry(List<Person> people) {

        return people.stream()
                .collect(Collectors.groupingBy(Person::getCountry));
    }


    /**
     *
     * @param people
     * Returning Set of kid names where age is less than 18
     */

    public static Set<String> getKidNames(List<Person> people) {

        return people.stream()
                .filter(person -> person.getAge() < 18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }


    /**
     *
     * @param people
     * Returning the oldest person in the list
     */

    public static Person getOldestPerson(List<Person> people) {

        return people.stream()
                .reduce( (personOne,personTwo) -> personOne.getAge() >= personTwo.getAge() ? personOne : personTwo )
                .orElse(null);

    }
}
