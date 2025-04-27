public class Event implements Comparable<Event> {
    private int time;
    private EventType eventType;
    private String clientType;  // Optional: To track client types (e.g., "Y")

    public Event(int time, EventType eventType, String clientType) {
        this.time = time;
        this.eventType = eventType;
        this.clientType = clientType;
    }

    public int getTime() {
        return time;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getClientType() {
        return clientType;
    }

    @Override
    public int compareTo(Event other) {
        return Integer.compare(this.time, other.time);
    }

    @Override
    public String toString() {
        return "Event time: " + time + ", Event type: " + eventType + (clientType != null ? ", Client type: " + clientType : "");
    }
}
