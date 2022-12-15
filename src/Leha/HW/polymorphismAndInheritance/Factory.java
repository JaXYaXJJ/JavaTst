package Leha.HW.polymorphismAndInheritance;

public class Factory {
    protected final static int MAX_EMPS = 100;
    Employee[] emps;
    int numOfEmps;

    public Factory() {

        this.emps = new Employee[MAX_EMPS];
        this.numOfEmps = 0;
    }

    public boolean addEmployee(Employee e) {

        if (numOfEmps <= MAX_EMPS) {

            this.emps[this.numOfEmps] = e;
            this.numOfEmps++;
            System.out.println("\n" + e.name + " added to list of employees");
            System.out.println("Available vacancies: " + (emps.length - numOfEmps));
        }
        return false;
    }

    public int numOfWorkers() {

        int numWorkers = 0;

        for (int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Worker.class) {
                numWorkers++;
            }
        }
        System.out.println("\nCurrent number of workers: " + numWorkers);
        System.out.println("\nCurrent number of managers: " + (numOfEmps - numWorkers));
        return numWorkers;
    }


    public Manager mostManager() {

        int maxEmps = 0;
        String managerName = "";

        for(int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Manager.class) {
                Manager manager = (Manager) emps[i];
                    if(manager.getNumOfWorkers() > maxEmps) {
                        maxEmps = manager.getNumOfWorkers();
                        managerName = manager.getName();
                    }
                }
            }
        System.out.println("\nManager with the most number of employees: "
                + managerName + " [" + maxEmps + "]");
        return null;
    }
}
