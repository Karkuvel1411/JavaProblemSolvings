package pongal_work;

public class level3_ques1 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1 || j == cols || i == 1 || i == rows) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
