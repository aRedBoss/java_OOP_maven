import java.util.ArrayList;
import java.util.Random;

public class ArrivalProcess {
    private Random random;

    public ArrivalProcess() {
        random = new Random();
    }

    public void generateArrivalEvents(ArrayList<Integer> eventList, int numEvents) {
        for (int i = 0; i < numEvents; i++) {
            int interval = random.nextInt(10) + 1;
            eventList.add(interval);
        }
    }

    public static void main(String[] args) {
        ArrivalProcess arrivalProcess = new ArrivalProcess();
        ArrayList<Integer> eventList = new ArrayList<>();

        arrivalProcess.generateArrivalEvents(eventList, 10);

        System.out.println("Generated Arrival Events:");
        for (int event : eventList) {
            System.out.println("Arrival Interval: " + event);
        }
    }
}
