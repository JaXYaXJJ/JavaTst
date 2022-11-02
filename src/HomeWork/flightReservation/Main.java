package HomeWork.flightReservation;

public class Main {
    public static void main(String[] args) {

        TicketReservation tktRes = new TicketReservation();

        tktRes.bookFlight(new Passenger("JJ"));
        tktRes.bookFlight(new Passenger("Iain"));
        tktRes.bookFlight(new Passenger("JJ"));
        tktRes.bookFlight(new Passenger("Irene"));
        tktRes.bookFlight(new Passenger("Eve"));
        tktRes.bookFlight(new Passenger("Bobby"));
        tktRes.bookFlight(new Passenger("Sean"));
        tktRes.bookFlight(new Passenger("Noah"));
        tktRes.bookFlight(new Passenger("John"));
        tktRes.bookFlight(new Passenger("Saga"));
        tktRes.bookFlight(new Passenger("Koby"));
        tktRes.bookFlight(new Passenger("Clark"));
        tktRes.bookFlight(new Passenger("Peter"));
        tktRes.bookFlight(new Passenger("Nadya"));
    }
}
