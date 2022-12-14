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

        Manager m1 = new Manager("Noah", 5000, 19);
        System.out.println(m1);
        System.out.println(m1.salary());

        Manager m2 = new Manager("Cole", 5000, 14);
        System.out.println(m2);
        System.out.println(m2.salary());

        Manager m3 = new Manager("Dona", 5000, 12);

        Employee e1 = new Employee("Alex") {
            @Override
            public double salary() {
                return 0;
            }
        };

        Employee e2 = new Employee("Lisa") {
            @Override
            public double salary() {
                return 0;
            }
        };

        Factory f1 = new Factory();
        f1.addEmployee(e1);
        f1.addEmployee(e2);

        f1.numOfWorkers();

        f1.addToManagerList(m1);
        f1.addToManagerList(m2);
        f1.addToManagerList(m3);

        f1.mostManager();

        f1.addToWorkerList(w1);
        f1.addToWorkerList(w2);
        f1.addToWorkerList(w3);
        f1.addToWorkerList(w4);

        f1.minHours();
    }
}
