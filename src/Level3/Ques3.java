package Level3;

public class Ques3 {
    public static void main(String[] args) {
        int n =4;
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }

            // Print asterisks
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
                // Add extra space between asterisks
                if (k < i) {
                    System.out.print("  ");
                }
            }

            System.out.println(); // Move to the next line
        }
    }
}
//I just copy this answer I don't know i ask my peers