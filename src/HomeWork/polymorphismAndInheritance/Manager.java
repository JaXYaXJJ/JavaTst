package HomeWork.polymorphismAndInheritance;

public class Manager extends Employee {

    double wage;
    int numOfWorkers;

    public Manager(String name, double wage, int workers) {

        super(name);

        this.wage = wage;
        this.numOfWorkers = workers;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    @Override
    public double salary() {

        wage = 5000;

        if (numOfWorkers <= 10) {
            System.out.println("Your wage: " + wage);
        } else if (numOfWorkers > 10 && numOfWorkers <= 20) {
            System.out.println("Your wage + bonus: " + (wage + numOfWorkers * 50.0));
        } else if (numOfWorkers > 20) {
            System.out.println("Your wage + bonus: " + (wage + 10 * 50 + 500));
        }
        System.out.println("\nYour basic wage: ");
        return wage;
    }

    @Override
    public String toString() {

        return "Employee's name: " + name
                + ", wage = " + wage
                + ", workers = " + numOfWorkers;
    }
}
