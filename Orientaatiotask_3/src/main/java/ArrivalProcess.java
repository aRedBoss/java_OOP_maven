import java.util.Random;
import java.util.List;

public class ArrivalProcess {
    private Random random;
    private String eventType;

    // Constructor that initializes the event type and random generator
    public ArrivalProcess(String eventType) {
        this.eventType = eventType;
        this.random = new Random();
    }

    // Generate events and add them to the event list
    public void generateEvents(int numberOfEvents, List<Event> eventList) {
        int currentTime = 0;
        for (int i = 0; i < numberOfEvents; i++) {
            // Random interval between 1 and 5 time units
            int interval = random.nextInt(5) + 1; // 1 to 5 units
            currentTime += interval;
            eventList.add(new Event(currentTime)); // Create event with the current time
        }
    }
}
