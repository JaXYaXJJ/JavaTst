package HomeWork.polymorphismAndInheritance;

public class Factory {

    Employee[] emps;
    int numOfEmps;
    protected int MAX_EMPS = 100;

    public Factory(Employee[] emps) {

        this.emps = emps;
    }

    public Factory() {

        MAX_EMPS = 0;
        numOfEmps = 0;
    }

    public boolean addEmployee(Employee e) {

        return false;
    }
}
