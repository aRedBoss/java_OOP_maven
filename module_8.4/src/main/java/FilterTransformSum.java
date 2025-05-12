import java.util.Arrays;
import java.util.List;

public class FilterTransformSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = numbers.stream()
                .filter(n -> n % 2 != 0) // Filter out even numbers
                .mapToInt(n -> n * 2)    // Double each remaining number
                .sum();                  // Find the sum of the resulting numbers

        System.out.println("Result: " + result);
    }
}

