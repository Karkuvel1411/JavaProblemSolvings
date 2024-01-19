package pongal_work;

import java.util.Scanner;

public class level2_ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Weight =sc.nextInt();
        if (Weight <= 5) {
            System.out.println(10);
        } else if (Weight <= 20) {
            System.out.println(20);
        } else {
            System.out.println(50);
        }
        sc.close();
    }
}
