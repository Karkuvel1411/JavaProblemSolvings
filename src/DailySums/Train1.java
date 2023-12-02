package DailySums;

public class Train1 {
    public static void main(String[] args) {
        String[] words = {"I", "am" ,"going", "out", "next" ,"week"};
        int len = words.length;
        for(int i =0;i<len-1;i++){
            if(words[i].length()==words[i+1].length()){
                System.out.println(words[i]  + " " + words[i+1]);
            }
        }
    }
}
