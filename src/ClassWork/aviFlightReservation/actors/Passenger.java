package ClassWork.aviFlightReservation.actors;

import ClassWork.aviFlightReservation.airline.FlightTicket;
import ClassWork.aviFlightReservation.enums.EFlightDestination;
import ClassWork.aviFlightReservation.enums.EGender;
import ClassWork.aviFlightReservation.enums.ESeatClass;

public class Passenger extends Person {

    private ESeatClass seatClass;
    private FlightTicket flightTicket;
    public EFlightDestination flightDestination;


    public Passenger(String firstName, String lastName, EFlightDestination flightDestination, EGender gender, ESeatClass seatClass) {

        super(firstName,lastName,gender);

        this.seatClass = seatClass;
        this.flightDestination = flightDestination;

        this.flightTicket = new FlightTicket();
    }

    public ESeatClass getSeatClass() {

        return seatClass;
    }

    public void setSeatClass(ESeatClass seatClass) {

        this.seatClass = seatClass;
    }

    public FlightTicket getFlightTicket() {

        return flightTicket;
    }

    public void setFlightTicket(FlightTicket flightTicket) {

        this.flightTicket = flightTicket;
    }

    public EFlightDestination getFlightDestination() {

        return flightDestination;
    }

    public void setFlightDestination(EFlightDestination flightDestination) {

        this.flightDestination = flightDestination;
    }

    @Override
    public boolean equals(Object obj) {

        boolean isEqual = false;

        if (obj instanceof Passenger) {

            isEqual = ((Passenger) obj).flightTicket.getConfirmationNumber().equals(this.flightTicket.getConfirmationNumber());
        }

        return isEqual;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + "->" + getFlightDestination() + "->" + getFlightTicket().getFlightDuration() + "->" +getSeatClass() + "->" + getFlightTicket().getConfirmationNumber();
    }
}
