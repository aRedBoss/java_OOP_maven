public class Clock {
    private static Clock instance;
    private int time;

    private Clock() {
        time = 0;
    }

    public static synchronized Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int newTime) {
        time = newTime;
    }

    public void incrementTime(int increment) {
        time += increment;
    }

    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        clock.setTime(5);
        System.out.println("Current Time: " + clock.getTime());

        clock.incrementTime(10);
        System.out.println("Current Time after increment: " + clock.getTime());
    }
}

