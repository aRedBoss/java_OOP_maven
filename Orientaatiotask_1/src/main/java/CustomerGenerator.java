public class CustomerGenerator {
    public static void generateCustomers(ServicePoint sp, int number) {
        for (int i = 0; i < number; i++) {
            Customer customer = new Customer();
            sp.addToQueue(customer);
        }
    }
}

