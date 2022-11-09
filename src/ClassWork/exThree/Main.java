package ClassWork.exThree;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //OLDEST PERSON
        Person roni = new Person("Roni",81);
        Person sara = new Person("Sara",4);
        Person viktor = new Person("Viktor",40);
        Person michal = new Person("Michal",42);

        List<Person> collection = Arrays.asList(roni,sara,viktor,michal);
        Person oldest = getOldestPerson(collection);

        if (oldest != null)
            System.out.println("Oldest person is " + oldest.getName());
        else
            System.out.println("Oldest object is null!");


        //CALCULATE
        System.out.println(calculate(Arrays.asList(1,5,3,2,1)));

    }

        public static Person getOldestPerson(List<Person> people) {

        return people.stream()
                    .reduce( (personOne, personTwo) -> personOne.getAge() >= personTwo.getAge() ?
                            personOne : personTwo)
                    .orElse(null);

    }

    public static int calculate(List<Integer> numbers) {

        return numbers.stream()
                .reduce(0, (num1, num2) -> num1 + num2);

//        return numbers.stream()
//                .reduce(0,Integer::sum);
    }
}
