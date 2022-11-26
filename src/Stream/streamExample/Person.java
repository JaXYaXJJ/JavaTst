package Stream.streamExample;

public class Person implements Comparable<JavaTst.collection.Person> {

    private String locality;
    private String name;
    private int age;

    public Person(String locality, String name, int age) {

        this.locality = locality;
        this.name = name;
        this.age = age;
    }

    public String getLocality() {
        return locality;
    }

    @Override
    public int compareTo(JavaTst.collection.Person o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}
