import java.util.Random;

class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserve(String customerName, int tickets) {
        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println(customerName + " reserved " + tickets + " tickets.");
            return true;
        } else {
            System.out.println(customerName + " couldn't reserve " + tickets + " tickets.");
            return false;
        }
    }
}

class Customer extends Thread {
    private Theater theater;
    private String name;
    private int tickets;

    public Customer(Theater theater, String name, int tickets) {
        this.theater = theater;
        this.name = name;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        theater.reserve(name, tickets);
    }
}

public class TicketReservationSystem {
    public static void main(String[] args) {
        Theater theater = new Theater(10); // total seats
        Random rand = new Random();

        for (int i = 1; i <= 15; i++) {
            int ticketsWanted = rand.nextInt(4) + 1; // 1 to 4 tickets
            new Customer(theater, "Customer " + i, ticketsWanted).start();
        }
    }
}
