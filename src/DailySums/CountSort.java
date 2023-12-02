package DailySums;

import java.util.HashMap;
import java.util.Map;



public class CountSort{
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4};

        // Create a HashMap to store the frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each integer in the array
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency map
        System.out.println("Frequency Map:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
