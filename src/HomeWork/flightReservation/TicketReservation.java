package HomeWork.flightReservation;

import java.util.*;

public class TicketReservation {

    private List<String> confirmedList;
    private Queue waitingList;

    protected final static int MAX_SIZE_OF_LIST = 7;
    protected final static int MAX_SIZE_OF_QUEUE = 3;

    public TicketReservation() {

        confirmedList = new ArrayList<>();
        waitingList = new ArrayDeque();

    }

    public boolean bookFlight(Passenger passenger) {

        String passengerFullName = passenger.getName() + " " + passenger.getLastName();
        if (confirmedList.contains(passengerFullName)
                || waitingList.contains(passengerFullName)) {
            System.out.println("FALSE");

        } else if (confirmedList.size() <= MAX_SIZE_OF_LIST) {
            confirmedList.add(passengerFullName);
            System.out.println(confirmedList);
            System.out.println(waitingList);

        } else if (waitingList.size() <= MAX_SIZE_OF_QUEUE) {
            waitingList.add(passengerFullName);
            System.out.println(confirmedList);
            System.out.println(waitingList);
        } else {
            System.out.println("Sorry " + passengerFullName + ", but reservation list and waiting list is full.");
            return false;
        }
        return true;
    }

    public boolean cancel(String confirmationNumber) {



        return false;
    }

    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {



        return false;
    }
}
