import java.util.Queue;
import java.util.LinkedList;

public class ServicePoint {
    private Queue<Event> queue;

    public ServicePoint() {
        queue = new LinkedList<>();
    }

    // Add event (customer arrival) to the service point queue
    public void addEvent(Event event) {
        queue.add(event);
    }

    // Serve customers (process events)
    public void serveCustomers() {
        while (!queue.isEmpty()) {
            Event event = queue.poll();
            System.out.println("Serving customer with arrival time: " + event.getEventTime());
        }
    }
}

