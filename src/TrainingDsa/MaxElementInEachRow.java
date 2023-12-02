import java.io.*;
public class MaxElementInEachRow {
    public static void main(String[] args) {
        int[][] array = {
                {3, 9, 4},
                {5, 1, 8},
                {7, 2, 6}
        };

        findMaxInEachRow(array);
    }

    public static void findMaxInEachRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int maxInRow = array[i][0]; // Initialize max with the first element of the row

            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] > maxInRow) {
                    maxInRow = array[i][j];
                }
            }

            System.out.println("Maximum element in Row " + i + " is: " + maxInRow);
        }
    }
}
