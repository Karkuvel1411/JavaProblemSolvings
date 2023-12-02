import java.util.*;
public class StringDuplicateHashmap {
    public static void main(String[] args) {
        String s = "GeeksGeeksfor";
        Map<Character, Integer> map = new HashMap<>();//empty map
        for (char c : s.toCharArray()) {
            if (map.get(c) == null) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char element = entry.getKey();
            int occur = entry.getValue();
//	                System.out.println("Duplicate character is " + element + " " +  "Occurance " +  occur );

            if(occur==1) {
                System.out.println("Duplicate key is " + element + " " + occur);
            }

        }
        Set<Character>set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
                System.out.print(c);
            }
        }
    }
}