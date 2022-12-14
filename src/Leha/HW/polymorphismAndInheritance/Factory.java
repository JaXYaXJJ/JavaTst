package Leha.HW.polymorphismAndInheritance;

import java.util.*;

public class Factory {

    Employee[] emps;
    int numOfEmps;
    protected final static int MAX_EMPS = 100;
    private List<Employee> list = new ArrayList<>();
    public static Map<String, Integer> managerList = new HashMap<>();
    public static Map<String, Integer> workerList = new HashMap<>();
    public Factory() {

        this.emps = new Employee[MAX_EMPS];
        this.numOfEmps = 0;
        this.list = new ArrayList<>();
    }

    public boolean addEmployee(Employee e) {

        while (numOfEmps <= MAX_EMPS) {

            list.add(e);
            System.out.println("\n" + list);
            System.out.println("Available vacancies: " + (emps.length - list.size()));
            return true;
        }
        return false;
    }

    public int numOfWorkers() {

        numOfEmps = list.size();
        System.out.println("\nCurrent number of employees: " + numOfEmps);
        return 0;
    }

    public void addToManagerList(Manager manager) {

        managerList.put(manager.name, manager.numOfWorkers);
        System.out.println("\n" + managerList);
    }

    public Manager mostManager() {

        int maxValue = Collections.max(managerList.values());

        List<String> maxValueManager = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : managerList.entrySet()) {
            if(entry.getValue() == maxValue) {
                maxValueManager.add(entry.getKey());
                System.out.println("\nManager with the most number of employees: "
                        + maxValueManager);
            }
        }
        return null;
    }

    public void addToWorkerList(Worker worker) {

        workerList.put(worker.name, worker.hours);
        System.out.println("\n" + workerList);
    }

    public Worker minHours() {

        int minValue = Collections.min(workerList.values());

        List<String> minHRWorker = new ArrayList<>();

        for(Map.Entry<String, Integer> entry : workerList.entrySet()) {
            if(entry.getValue() == minValue) {
                minHRWorker.add(entry.getKey());
                System.out.println("\nEmployee whit min hours: "
                        + minHRWorker);
            }
        }
        return null;
    }
}
