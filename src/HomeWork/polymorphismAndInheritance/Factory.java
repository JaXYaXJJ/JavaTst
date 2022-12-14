package HomeWork.polymorphismAndInheritance;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    Employee[] emps;
    int numOfEmps;
    protected final static int MAX_EMPS = 100;
    private List<Employee> list;

    public Factory() {

        this.emps = new Employee[MAX_EMPS];
        this.numOfEmps = 0;
        this.list = new ArrayList<>();
    }

    public boolean addEmployee(Employee e) {

        while (numOfEmps <= MAX_EMPS) {

            list.add(e);
            System.out.println("\n" + list);
            emps = list.toArray(new Employee[MAX_EMPS]);

            numOfEmps++;
            System.out.println("Current number of employees: " + numOfEmps + "\n");

            for (int i = 0; i < emps.length; i++) {
                System.out.println(emps[i]);
            }
            return true;
        }
        return false;
    }
}