package DailySums;

import java.util.HashMap;
import java.util.Map;

public class Lmap {
    public static void main(String[] args) {

        String s="aaasdfgasdfgasdf";

        Map<Character,Integer> m=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                int temp=m.get(s.charAt(i));
                m.put(s.charAt(i),temp+1);
            }else{
                m.put(s.charAt(i),1);
            }
        }

        for (Map.Entry<Character,Integer> n:m.entrySet()
             ) {
            System.out.println(n.getKey()+" : "+n.getValue());
        }

        System.out.println(m.toString());
    }
}
