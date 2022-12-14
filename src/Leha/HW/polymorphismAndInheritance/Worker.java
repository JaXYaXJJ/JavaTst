package Leha.HW.polymorphismAndInheritance;

public class Worker extends Employee {

    double wagePerHour;
    int hours;

    public Worker(String name, double wage) {

        super(name);

        this.wagePerHour = wage;
    }

    @Override
    public double salary() {

        return wagePerHour * hours;
    }

    public double getWagePerHour() { return wagePerHour; }

    public void setWagePerHour(double wagePerHour) { this.wagePerHour = wagePerHour; }

    public int getHours() { return hours; }

    public void setHours(int hours) { this.hours = hours; }

    @Override
    public String toString() {

        return "\nEmployee's name: " + name
                + "\nwage per hour = " + wagePerHour
                + "\nhours = " + hours;
    }
}
