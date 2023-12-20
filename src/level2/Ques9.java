package level2;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 5;
        int product = n*m;
        double sqrt = Math.sqrt(product);
        if(sqrt == Math.floor(sqrt) && !Double.isInfinite(sqrt)){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not Perfect Square");
        };

    }
}
