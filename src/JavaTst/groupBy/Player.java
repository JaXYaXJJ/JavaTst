package JavaTst.groupBy;

public abstract  class Player {

    private int number;
    private String name;
    private int age;
    private String locality;

    public Player(int number, String name, int age, String locality) {

        this.number = number;
        this.name = name;
        this.age = age;
        this.locality = locality;
    }

    public int getAge() {
        return age;
    }

    public String getLocality() {
        return locality;
    }

    @Override
    public String toString() {
        return "(name: " + name + " , age: " + age + " , locality: " + locality + ")";
    }
}
