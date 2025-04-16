import java.util.LinkedList;
import java.util.Scanner;

public class QueueSimulation {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter command (queue, dequeue, exit):");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("queue")) {
                Customer customer = new Customer();
                queue.addFirst(customer);
                System.out.println("Customer " + customer.getId() + " added to queue.");
            } else if (input.equalsIgnoreCase("dequeue")) {
                if (!queue.isEmpty()) {
                    Customer customer = queue.removeLast();
                    customer.setEndTime(System.nanoTime());
                    long timeSpent = customer.getTimeSpent();
                    System.out.println("Customer " + customer.getId() + " removed. Time in queue: " + timeSpent + " ns.");
                } else {
                    System.out.println("Queue is empty.");
                }
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }
        }

        scanner.close();
    }
}

