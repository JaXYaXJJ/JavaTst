package Leha.HW.polymorphismAndInheritance;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("John", 40);
        w1.setHours(210);
        System.out.println(w1);
        System.out.println(w1.salary());

        Worker w2 = new Worker("Mike", 35);
        w2.setHours(190);

        Worker w3 = new Worker("Lina", 39);
        w3.setHours(219);

        Worker w4 = new Worker("Koby", 36);
        w4.setHours(238);

        Manager m1 = new Manager("Noah", 5000, 14);
        System.out.println(m1);
        System.out.println(m1.salary());

        Manager m2 = new Manager("Cole", 5000, 19);
        System.out.println(m2);
        System.out.println(m2.salary());

        Manager m3 = new Manager("Dona", 5000, 12);

        Factory f1 = new Factory();

        f1.addEmployee(m1);
        f1.addEmployee(m2);
        f1.addEmployee(m3);
        f1.addEmployee(w1);
        f1.addEmployee(w2);
        f1.addEmployee(w3);
        f1.addEmployee(w4);

        f1.numOfWorkers();

        f1.mostManager();

        f1.minHours();

        f1.maxSalary();

        f1.getByName("Koby");

        f1.toString();
    }
}
