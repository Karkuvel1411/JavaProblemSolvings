package DailySums;

public class Train5 {
    public static void main(String[] args) {
        String[] alpha = {"i", "am", "good", "at", "programming"};
        String[] alpha1 = {"i", "am", "going", "out" ,"next" };


        for(int i =0;i<alpha.length-1;i++){
            for(int j=0;j<alpha1.length-1;j++){
                if(alpha[i]==alpha1[j]){
                  System.out.println(alpha[i] + " " + alpha[j]);
                }
            }
        }
    }
}
