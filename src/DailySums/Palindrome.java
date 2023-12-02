package DailySums;

public class Palindrome {
    public static void main(String[] args) {
        String a ="anna";
        char[] alpha = a.toCharArray();
        String reverse ="";
        int l = alpha.length-1;
        for(int i =l;i>=0;i--){
            reverse =reverse+alpha[i];
        }
       if(a.equals(reverse)){
           System.out.println("It's a palindrome ");
       }else{
           System.out.println("It's not a palindrome ");

       }
    }
}
