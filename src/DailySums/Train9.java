package DailySums;

public class Train9{
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 1, 7, 3, 6, 4};

        int secondMin = findSecondMinimum(array);

        if (secondMin != Integer.MAX_VALUE) {
            System.out.println("Second minimum value in the array: " + secondMin);
        } else {
            System.out.println("Array does not have a second minimum value.");
        }
    }

    static int findSecondMinimum(int[] arr) {
        if (arr.length < 2) {
            // Array doesn't have enough elements
            return Integer.MAX_VALUE;
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < min) {
                // Found a new minimum, update both min and secondMin
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                // Found a new second minimum
                secondMin = num;
            }
        }

        return secondMin;
    }
}

