import java.util.PriorityQueue;

public class EventList {
    private PriorityQueue<Event> events;

    public EventList() {
        events = new PriorityQueue<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public Event getNextEvent() {
        return events.poll();
    }

    public boolean hasEvents() {
        return !events.isEmpty();
    }

    public void printEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }
}
