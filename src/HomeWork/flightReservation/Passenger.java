package HomeWork.flightReservation;

public class Passenger {

    private String firsName;
    private String lastName;
    private String seatClass;
    private String confirmationNumber;

    public Passenger(String firsName, String lastName, String seatClass, String confirmationNumber) {

        this.firsName = firsName;
        this.lastName = lastName;
        this.seatClass = seatClass;
        this.confirmationNumber = confirmationNumber;

    }

    public String getName() {

        return firsName;
    }

    public void setName(String name) {

        this.firsName = name;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getSeatClass() {

        return seatClass;
    }

    public void setSeatClass(String seatClass) {

        this.seatClass = seatClass;
    }

    public String getConfirmationNumber() {

        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {

        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {

        return this.firsName;
    }
}
