package Leha.HW.polymorphismAndInheritance;

import java.util.*;

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

        for (int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Manager.class) {
                Manager manager = (Manager) emps[i];
                if (manager.getNumOfWorkers() > maxEmps) {
                    maxEmps = manager.getNumOfWorkers();
                    managerName = manager.getName();
                }
            }
        }
        System.out.println("\nManager with the most number of employees: "
                + managerName + " [" + maxEmps + "]");
        return null;
    }

    public Worker minHours() {

        Map<String, Integer> hr = new HashMap<>();

        for (int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Worker.class) {
                Worker worker = (Worker) emps[i];
                hr.put(worker.getName(), worker.getHours());
            }
        }
        Map.Entry<String, Integer> minEntry = hr.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .orElse(null);
        System.out.println("\nWorker whit min hours: " + minEntry.getKey() + " [" + minEntry.getValue() + "HR]");
        return null;
    }

    public Employee maxSalary() {

        Map<String, Double> salary = new HashMap<>();

        for (int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Worker.class || emps[i].getClass() == Manager.class) {
                Employee employee = emps[i];
                salary.put(employee.getName(), employee.salary());
            }
        }
        Map.Entry<String, Double> maxEntry =
                Collections.max(salary.entrySet(), Map.Entry.comparingByValue());
        System.out.println("\nEmployee whit max salary: " + maxEntry.getKey() + " [" + maxEntry.getValue() + "NIS]");
        return null;
    }

    public Employee getByName(String eName) {

        for (int i = 0; i < this.numOfEmps; i++) {
            Employee employee = emps[i];
            if (employee.getName().contains(eName)) {
                System.out.println(employee);
            }
        }
        return null;
    }

    public String toString() {

        ArrayList<Worker> workers = new ArrayList<>();

        for (int i = 0; i < this.numOfEmps; i++) {
            if (emps[i].getClass() == Worker.class) {
                Worker worker = (Worker) emps[i];
                workers.add(worker);
            }
        }
        System.out.println(workers);
        return null;
    }
}