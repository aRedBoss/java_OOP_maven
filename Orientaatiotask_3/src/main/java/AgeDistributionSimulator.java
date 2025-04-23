import java.util.ArrayList;
import java.util.Random;

public class AgeDistributionSimulator {
    public static void main(String[] args) {

        double[] probabilities = {0.4, 0.35, 0.15, 0.1};
        int[] ageGroups = {20, 23, 26, 30};

        ArrayList<Integer> ages = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            double randomValue = random.nextDouble();
            int selectedGroup = -1;
            double cumulativeProbability = 0;

            for (int j = 0; j < probabilities.length; j++) {
                cumulativeProbability += probabilities[j];
                if (randomValue < cumulativeProbability) {
                    selectedGroup = j;
                    break;
                }
            }

            int randomAge = random.nextInt(ageGroups[selectedGroup]) + 18;
            ages.add(randomAge);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ages.get(i));
        }
    }
}

