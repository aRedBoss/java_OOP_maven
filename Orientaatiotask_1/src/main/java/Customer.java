public class Customer {
    private static int counter = 0;
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        counter++;
        this.id = counter;
        this.startTime = System.nanoTime();
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getTimeSpent() {
        return endTime - startTime;
    }
}

