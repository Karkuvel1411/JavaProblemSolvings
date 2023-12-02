package TrainingDsa;

import java.util.*;

public class Iteration {
    public static void main(String[] args) {
        String[] arrays = {"orange", "apple", "mango", "banana"};

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            arr.add(arrays[i]);
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals("banana")) {
                System.out.println(arr.remove(i));

            }
        }

        System.out.println( arr);
    }
}
