import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int servedCustomers = 0;

    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    public Customer removeFromQueue() {
        if (!queue.isEmpty()) {
            return queue.removeLast();
        }
        return null;
    }

    public void serve() {
        while (!queue.isEmpty()) {
            Customer customer = removeFromQueue();
            long waitTime = System.nanoTime() - customer.getStartTime();
            int sleepTime = (int)(Math.random() * 1000) + 500; // between 500ms - 1500ms

            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            customer.setEndTime(System.nanoTime());
            long serviceTime = customer.getTimeSpent() - waitTime;
            totalServiceTime += serviceTime;
            servedCustomers++;

            System.out.println("Customer " + customer.getId() + " served.");
            System.out.println("→ Wait time: " + waitTime + " ns");
            System.out.println("→ Service time: " + serviceTime + " ns");
            System.out.println("→ Response time: " + customer.getTimeSpent() + " ns");
        }

        if (servedCustomers > 0) {
            long averageServiceTime = totalServiceTime / servedCustomers;
            System.out.println("Average service time: " + averageServiceTime + " ns");
        } else {
            System.out.println("No customers served.");
        }
    }
}

