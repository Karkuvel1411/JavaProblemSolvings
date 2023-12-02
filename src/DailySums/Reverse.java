package DailySums;

public class Reverse {
    public static void main(String[] args) {
        String[] words = {"hello","world"};

        String temp = "";
        int start =0;
        int end = words.length-1;
        for(int i=end;i>=start;i--){
           System.out.print(words[i]+" ");
        }

    }
}
