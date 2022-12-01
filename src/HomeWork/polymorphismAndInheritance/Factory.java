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

//        if (numOfEmps <= MAX_EMPS) {
//            list.add(e);
//            System.out.println(list);
//            System.out.println(list.size());
//            return true;
//        } else {
//            return false;
//        }
        while (numOfEmps < MAX_EMPS) {
            list.add(e);
            System.out.println(list);
            numOfEmps++;
            System.out.println("Current number of employees: " + numOfEmps);
            return true;
        }
        return false;
    }
}