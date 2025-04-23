public class Clock {
    private static Clock instance;
    private int currentTime;

    // Private constructor to ensure no external instantiation
    private Clock() {
        currentTime = 0;
    }

    // Singleton instance getter
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Method to get the current time
    public int getTime() {
        return currentTime;
    }

    // Method to advance the time
    public void advanceTime(int timeUnits) {
        currentTime += timeUnits;
    }
}
