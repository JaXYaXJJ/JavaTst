package HomeWork.ticketBookingEx;

public class TicketBooking implements Runnable {

    private int ticketsAvailable;
    public void setTicketsAvailable(int ticketsAvailable) {

        this.ticketsAvailable = ticketsAvailable;
    }

    private void buyTicket(int available) {

        synchronized(this) {
        if (ticketsAvailable == available) {
            System.out.println(Thread.currentThread().getName()
                    + " going to buy a ticket." + " [Ava. Tkt: " + ticketsAvailable + "]");
                ticketsAvailable -= available;
                System.out.println(Thread.currentThread().getName()
                        + " bought a ticket...!" + " [Ava. Tkt: " + ticketsAvailable + "]");

            }
        }
    }

    @Override
    public void run() {

        buyTicket(1);
        if (ticketsAvailable < 0)
            System.out.println("No tickets more...!");
    }

    //JavaTst.tst.Main
    public static void main(String[] args) {

        TicketBooking ticketBooking = new TicketBooking();
        ticketBooking.setTicketsAvailable(1);

        Thread tOne = new Thread(ticketBooking);
        Thread tTwo = new Thread(ticketBooking);

        tOne.setName("Curt");
        tTwo.setName("Dave");

        tOne.start();
        tTwo.start();
    }
}
