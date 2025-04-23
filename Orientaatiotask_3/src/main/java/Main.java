import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list to store events
        List<Event> eventList = new ArrayList<>();

        // Create an ArrivalProcess to generate events
        ArrivalProcess arrivalProcess = new ArrivalProcess("Customer Arrival");
        arrivalProcess.generateEvents(10, eventList); // Generate 10 events

        // Print out the event list
        System.out.println("Event List:");
        for (Event event : eventList) {
            System.out.println("Event Time: " + event.getEventTime());
        }

        // Create a service point and add events to it
        ServicePoint servicePoint = new ServicePoint();
        for (Event event : eventList) {
            servicePoint.addEvent(event); // Add event (customer) to the queue
        }

        // Serve the customers (process the events)
        System.out.println("\nServing customers:");
        servicePoint.serveCustomers();
    }
}

