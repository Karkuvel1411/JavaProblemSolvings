package DailySums;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatingIntegers {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each integer in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the most repeating integers
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Print the most repeating integers
        System.out.println("Most Repeating Integers:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey());
            }
        }
    }
}
