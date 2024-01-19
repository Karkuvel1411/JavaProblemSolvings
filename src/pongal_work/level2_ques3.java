package pongal_work;

public class level2_ques3 {
    public static void main(String[] args) {
        int n = 710;
        boolean isLucky = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 7) {
                isLucky = true;
                break;
            }
            n = n / 10;
        }

        System.out.println(isLucky ? 1 : 0);
    }
}
