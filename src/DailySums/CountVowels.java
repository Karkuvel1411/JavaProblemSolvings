package DailySums;

public class CountVowels {
    public static void main(String[] args) {
        String input ="karkuvel";
        char[] convertarr = input.toCharArray();
        int count=0;
        for(int i=0;i<convertarr.length-1;i++){
            if(convertarr[i]=='a'|| convertarr[i]=='e'|| convertarr[i]=='i'|| convertarr[i]=='o'|| convertarr[i]=='u'){
               count++;
            }
        }
        System.out.println("Vowels" + count);
    }
}
