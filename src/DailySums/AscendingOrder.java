package DailySums;

import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        String a ="BaDc";
        String low = a.toLowerCase();
        char[] alph = low.toCharArray();
        int l = alph.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                char temp;
                if (alph[j] > alph[j + 1]) {
                    temp = alph[j];
                    alph[j] = alph[j + 1];
                    alph[j + 1] = temp;
                }
            }
        }


System.out.println(Arrays.toString(alph));
    }
}
