import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Customer {
    private int arrivalTime;

    public Customer(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
}

class Event {
    private int time;

    public Event(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}

class EventType {
    public static final String ARRIVAL = "Arrival";
}

class EventList {
    private ArrayList<Event> events = new ArrayList<>();

    public void addEvent(Event event) {
        events.add(event);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }
}

class ServicePoint {
    private Queue<Customer> queue = new LinkedList<>();

    public Queue<Customer> getQueue() {
        return queue;
    }

    public void addCustomer(Customer customer) {
        queue.offer(customer);
    }

    public void serveCustomer() {
        if (!queue.isEmpty()) {
            Customer customer = queue.poll();
            System.out.println("Serving customer with arrival time: " + customer.getArrivalTime());
        }
    }
}

public class Simulator {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        EventList eventList = new EventList();
        ArrivalProcess arrivalProcess = new ArrivalProcess();

        // Generate 10 arrival events
        arrivalProcess.generateArrivalEvents(new ArrayList<Integer>(), 10);

        // Create arrival events and add them to event list
        for (int i = 0; i < 10; i++) {
            Event event = new Event(i * 5); // Each event occurs after 5 units of time
            eventList.addEvent(event);
        }

        // Print event list
        System.out.println("Event List:");
        for (Event event : eventList.getEvents()) {
            System.out.println("Event Time: " + event.getTime());
        }

        // Process events and add customers to the service point
        ServicePoint servicePoint = new ServicePoint();
        for (Event event : eventList.getEvents()) {
            Customer customer = new Customer(event.getTime());
            servicePoint.addCustomer(customer);
        }

        // Serve customers
        System.out.println("\nServing customers:");
        while (!servicePoint.getQueue().isEmpty()) {
            servicePoint.serveCustomer();
            clock.incrementTime(5); // Increment clock by 5 time units after each customer is served
        }
    }
}

