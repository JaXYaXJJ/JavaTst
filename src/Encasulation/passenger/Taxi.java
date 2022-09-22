package Encasulation.passenger;

public class Taxi {

    private int sits;
    private String driverName;
    protected String company;

    public Taxi (int sits, String driverName, String company) {

        this.sits = sits;
        this.driverName = driverName;
        this.company = company;
    }

    public Taxi() {

    }

    // GETTERS & SETTERS

    public int getSits() {
        return this.sits;
    }

    public void setSits(int sits) {

        if (sits >= 5 && sits <= 7)
            this.sits = sits;
        else
            System.out.println("Sits number is not valid!");
    }

    public String getDriverName() {
        return this.driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {

        return "Driver name is " + this.driverName + "\nCompany name is "+ this.company;
    }


}
