package HomeWork.polymorphismAndInheritance;

public class Worker extends Employee {

    double wagePerHour;
    int hours;

    public Worker(String name, double wage) {

        super(name);

        this.wagePerHour = wage;
    }

    public double salary() {

        return wagePerHour * hours;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {

        return "Employee's name: " + name
                + ", wage = " + wagePerHour
                + ", hours = " + hours;
    }
}
