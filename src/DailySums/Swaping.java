package DailySums;

import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        for(int i =0;i<array.length-3;i++){
           int temp =array[i];
            array[i]=array[i+2];
            array[i+2]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
