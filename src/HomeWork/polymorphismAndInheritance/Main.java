package HomeWork.polymorphismAndInheritance;

public class Main {
    public static void main(String[] args) {

//        Worker worker = new Worker("John", 42);
//        worker.setHours(220);
//        System.out.println(worker);
//        System.out.println(worker.salary());
//
//        Manager manager = new Manager("Paul", 50, 15);
//        System.out.println(manager);
//        System.out.println(manager.salary());

        Employee employeeOne = new Employee("Curt") {
            @Override
            public double salary() {
                return 0;
            }
        };

        Employee employeeTwo = new Employee("Mike") {
            @Override
            public double salary() {
                return 0;
            }
        };

        Employee employeeThree = new Employee("Iain") {
            @Override
            public double salary() { return 0; }
        };

        Factory factory = new Factory();
        factory.addEmployee(employeeOne);
        factory.addEmployee(employeeTwo);
        factory.addEmployee(employeeThree);
    }
}
