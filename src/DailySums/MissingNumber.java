package DailySums;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {4, 8, 10, 12, 24, 28};
        int n = findLeastDifference(a);
        // Start from the first expected number
        int expectedNumber = findLeastDifference(a);
        for (int num : a) {
            while (num > expectedNumber) {
                System.out.println("Missing number: " + expectedNumber);
                expectedNumber += n; // Move to the next expected number
            }
            expectedNumber += n;
        }
    }
    private static int findLeastDifference(int[] a){
        int diff = Integer.MAX_VALUE; //
        for (int i = 0; i < a.length - 1; i++) {
            int currentDifference = a[i + 1] - a[i]; // 2
            diff = Math.min(diff, currentDifference);
        }
        return diff;
    }
}
