package HomeWork.flightReservation;

public class Main {
    public static void main(String[] args) {

        TicketReservation tktRes = new TicketReservation();

        tktRes.bookFlight(new Passenger("JJ", "Zak", "economy", "001"));
        tktRes.bookFlight(new Passenger("Iain", "Zak", "economy", "002"));
        tktRes.bookFlight(new Passenger("JJ", "Zak", "first", "003"));
        tktRes.bookFlight(new Passenger("Irene", "Zak", "business", "004"));
        tktRes.bookFlight(new Passenger("Eve", "Zak", "business", "005"));
        tktRes.bookFlight(new Passenger("Mick", "Jagger", "economy", "006"));
        tktRes.bookFlight(new Passenger("Whitney", "Houston", "economy", "007"));
        tktRes.bookFlight(new Passenger("Robbie", "Williams", "first", "008"));
        tktRes.bookFlight(new Passenger("Peter", "Parker", "business", "009"));
        tktRes.bookFlight(new Passenger("Saga", "Loren", "first", "009"));
        tktRes.bookFlight(new Passenger("Steph", "Curry", "economy", "010"));
        tktRes.bookFlight(new Passenger("Clark", "Kent", "first", "011"));
        tktRes.bookFlight(new Passenger("Bill", "Gates", "economy", "012"));
        tktRes.bookFlight(new Passenger("Elon", "Musk", "economy", "013"));

        tktRes.cancel("001");

    }
}
