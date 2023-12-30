package Level3;

import java.util.Scanner;

public class Day2_Ques5 {
    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Driver Program
    public static void main(String args[])
    {
        if (isPrime(11))
            System.out.println(" true");
        else
            System.out.println(" false");
    }
}
