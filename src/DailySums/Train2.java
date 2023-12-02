package DailySums;

public class Train2 {
    public static void main(String[] args) {
        String[] words = {"raj", "akila","wsdwe","mani","moni","wewew"};
        int len = words[1].length();
        for(int i=0;i<words.length;i++){
             if(words[i].length()==len){
                 System.out.println(words[i]);
             }
        }

    }
}
