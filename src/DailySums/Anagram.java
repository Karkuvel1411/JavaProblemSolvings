package DailySums;
import java.sql.SQLOutput;
import java.util.*;


public class Anagram {

    public static void main(String[] args) {
        String a ="silent";
        String b="listen";
//  ;lnuiytrxyuhujikol;
        String low = a.toLowerCase();
        String low1 = b.toLowerCase();

        // Check if the lengths are different
        if (a.length() != b.length()) {
            System.out.println("not anagram");
        }
        char[] alph = low.toCharArray();
        char[] alph1 = low1.toCharArray();

        for (int i = 0; i < alph.length - 1; i++) {
            for (int j = 0; j < alph.length - 1 - i; j++) {
                if (alph[j] > alph[j + 1]) {
                    char temp = alph[j];
                    alph[j] = alph[j + 1];
                    alph[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array a: " + new String(alph));

        for(int i =0;i<alph1.length-1;i++){
            char temp;
            for(int j=0;j<alph1.length-1-i-1;j++){
                temp = alph1[j];
                alph1[j] = alph1[j + 1];
                alph1[j + 1] = temp;
            }
        }
        System.out.println("Sorted array a: " + new String(alph));


        int count = 0;
        for(int i=0;i<alph.length-1;i++){
            for(int j =0; j<alph1.length-1;j++){
                if(alph[i]!=alph1[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        if(count<0){
            System.out.println("Anagrams");
        }
    }
}































//
//public class Anagram {
//    public static void main(String[] args) {
//        String a="listen";
//        String b ="silent";
//
//        String low = a.toLowerCase();
//        String low1 = b.toLowerCase();
//
//        char[] letters = low.toCharArray();
//        char[] letters2 = low1.toCharArray();
//
//        Arrays.sort(letters);
//        Arrays.sort(letters2);
//
//
//                if(Arrays.equals(letters,letters2)){
//                    System.out.println("yes");
//                }else{
//                    System.out.println("no");
//                }
//
//    }
//}
