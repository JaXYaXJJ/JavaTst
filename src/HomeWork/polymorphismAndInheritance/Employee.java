package HomeWork.polymorphismAndInheritance;

public abstract class Employee {

    String name;

    public Employee (String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    @Override
    public String toString() {

        return "Employee's name: " + name;
    }

    public abstract double salary();
}
