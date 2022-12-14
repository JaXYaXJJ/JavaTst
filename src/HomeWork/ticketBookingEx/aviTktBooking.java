package HomeWork.ticketBookingEx;

//Avi Ex.
import java.util.concurrent.TimeUnit;

public class aviTktBooking implements Runnable {

    private int ticketsAvailable;

    //Setter for ticketsAvailable variable
    public void setTicketsAvailable(int ticketsAvailable) {
        this.ticketsAvailable = ticketsAvailable;
    }

    //Perform ticketing operation
    private void bookTicket() {

        synchronized (this) {

            if (ticketsAvailable > 0) {

                System.out.println("Booking a ticket for " + Thread.currentThread().getName());

                //2 secs delay for ticketing action
                try {
                    Thread.sleep(TimeUnit.SECONDS.toSeconds(2));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                ticketsAvailable--;

                System.out.println("Ticket booked for " + Thread.currentThread().getName());
                System.out.println("Number of tickets left " + ticketsAvailable);

            } else {
                System.out.println("No tickets left for " + Thread.currentThread().getName());
            }
        }
    }

    @Override
    public void run() {
        bookTicket();
    }
}
