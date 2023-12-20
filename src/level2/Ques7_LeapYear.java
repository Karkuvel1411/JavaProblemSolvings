package level2;

import java.util.Scanner;

public class Ques7_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%4==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
