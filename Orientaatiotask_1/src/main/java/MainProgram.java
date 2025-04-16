public class MainProgram {
    public static void main(String[] args) {
        ServicePoint sp = new ServicePoint();
        CustomerGenerator.generateCustomers(sp, 5);
        sp.serve();
    }
}

