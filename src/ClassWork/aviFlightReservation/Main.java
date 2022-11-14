package ClassWork.aviFlightReservation;

import ClassWork.aviFlightReservation.actors.Passenger;
import ClassWork.aviFlightReservation.airline.TicketReservation;
import ClassWork.aviFlightReservation.utils.FlightSystemUtils;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

    public static TicketReservation ticketReservation;

    public static void main(String[] args) throws FileNotFoundException {

        ticketReservation = new TicketReservation();

        List<Passenger> passengerList = FlightSystemUtils.parsePassengersFile();

        passengerList.forEach(System.out::println);

        passengerList.forEach(passenger -> ticketReservation.bookFlight(passenger));

        System.out.println("\n######################################################################");
        ticketReservation.getWaitingList().forEach(System.out::println);
        System.out.println("######################################################################\n");


        ticketReservation.cancel(
                ticketReservation.getConfirmedList()
                        .get(0)
                        .getFlightTicket()
                        .getConfirmationNumber()
        );


        System.out.println("\n######################################################################");
        ticketReservation.getWaitingList().forEach(System.out::println);
        System.out.println("######################################################################\n");


        System.out.println("\n######################################################################");
        ticketReservation.getConfirmedList().forEach(System.out::println);
        System.out.println("######################################################################\n");

    }
}

