package JavaTst;

public class Main {

    int age;
    String name;
    static String collegeName = "TLV";

    public static void main(String[] args) {

        Main main = new Main();
        Main mainTwo = new Main();

        main.age = 2;
        mainTwo.age = 4;

        Person personOne = new Person(
                "JJ",
                "Zakalinsky",
                35,
                80,
                5
        );

        Person personTwo = new Person(
                "Eve",
                "Zakalinsky",
                4,
                20,
                5
        );

        personOne.setAge(19);
        System.out.println(personOne.age);
    }
}
