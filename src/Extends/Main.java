package Extends;

public class Main {

    public static void main(String[] args) {

        String text = "Some nice text!";

        Programmer programmer = new Programmer();
        Person person = new Programmer();
        Person anotherPerson = new Person();
        Main obj = new Main();

        System.out.println("text is instance of String class : " + (text instanceof String));
        System.out.println("programmer in instance of Programmer class : " + (programmer instanceof  Programmer));
        System.out.println("programmer is instance of Person class : " + (programmer instanceof Person));
        System.out.println("person is instance of Programmer class : " + (person instanceof Programmer));

        System.out.println("anotherPerson is instance of Programmer class : " + (anotherPerson instanceof Programmer));
    }
}
