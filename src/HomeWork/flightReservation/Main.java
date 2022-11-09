package HomeWork.flightReservation;

public class Main {
    public static void main(String[] args) {

        TicketReservation tktRes = new TicketReservation();

        tktRes.bookFlight(new Passenger("JJ", "Zak", "economy", "001"));
        tktRes.bookFlight(new Passenger("Iain", "Zak", "economy", "002"));
        tktRes.bookFlight(new Passenger("JJ", "Zak", "first", "003"));
        tktRes.bookFlight(new Passenger("Irene", "Zak", "business", "004"));
        tktRes.bookFlight(new Passenger("Eve", "Zak", "business", "005"));
        tktRes.bookFlight(new Passenger("Bobby", "Williams", "economy", "006"));
        tktRes.bookFlight(new Passenger("Sean", "Paul", "economy", "007"));
        tktRes.bookFlight(new Passenger("Noah", "Johnson", "first", "008"));
        tktRes.bookFlight(new Passenger("John", "Williams", "business", "009"));
        tktRes.bookFlight(new Passenger("Saga", "Loren", "first", "009"));
        tktRes.bookFlight(new Passenger("Koby", "Larson", "economy", "010"));
        tktRes.bookFlight(new Passenger("Clark", "Loren", "first", "011"));
        tktRes.bookFlight(new Passenger("Peter", "Robson", "economy", "012"));
        tktRes.bookFlight(new Passenger("Nadya", "Robson", "economy", "013"));

        tktRes.cancel("001");
    }
}
