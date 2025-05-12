import java.util.Arrays;

public class MeanCalculator {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double mean = Arrays.stream(numbers).average().orElse(Double.NaN);
        System.out.println("Mean: " + mean);
    }
}

