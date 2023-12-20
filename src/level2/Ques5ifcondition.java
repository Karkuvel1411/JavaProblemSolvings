package level2;

import java.util.Scanner;

public class Ques5ifcondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark < 59) {
            System.out.println("E");
        }
        else if (mark < 69) {
            System.out.println("D");
        }
        else if (mark < 79) {
            System.out.println("C");
        }
        else if (mark < 89) {
            System.out.println("B");
        }
        else if (mark <=99) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
