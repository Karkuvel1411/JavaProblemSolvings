package level2;

import java.util.Scanner;

public class Ques11_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        if((n & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
}
