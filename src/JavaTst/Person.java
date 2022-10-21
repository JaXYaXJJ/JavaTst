package JavaTst;

public class Person {

    String firstName;
    String lastName;
    int age;
    int weight;
    int rank;

    public Person (String name, String surname, int age, int weight, int rank) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
        this.weight = weight;
        this.rank = rank;
    }

    public void setAge(int age) {
        this.age = age;
        if (age <= 17) {
            System.out.println("Error");
        } else {
            System.out.println("Welcome");
        }
    }

    public int getAge() {
        return age;
    }
}
