package level2;

import java.util.Scanner;

public class Ques10_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals("a") ||input.equals("e") ||input.equals("i") ||input.equals("o")||input.equals("u")){
            System.out.println("Vowels");
        }else{
            System.out.println("Not Vowels");
        }
    }
}
