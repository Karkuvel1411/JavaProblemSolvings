package DailySums;

import java.util.HashMap;
import java.util.Map;

public class Train6 {
    public static void main(String[] args) {
        String[] brands = {"bajaj", "hero", "bajaj", "honda", "hero", "yamaha"};

        Map<String, Integer> bikeBrands = new HashMap<>();
        for (int i = 0; i < brands.length; i++) {
            if (bikeBrands.containsKey(brands[i])) {
                bikeBrands.put(brands[i], bikeBrands.get(brands[i]) + 1);
            } else {
                bikeBrands.put(brands[i], 1);
            }
        }

        System.out.println(bikeBrands);

        for (Map.Entry<String, Integer> entry : bikeBrands.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}