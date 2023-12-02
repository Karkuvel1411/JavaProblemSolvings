package DailySums;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {19, 28, 817, 928, 19, 10};
        int l = numbers.length;

        int maxElement = numbers[0];  // Assume the first element is the maximum

        for (int i = 1; i < l; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
            }
        }

        System.out.println( maxElement);
    }
}
