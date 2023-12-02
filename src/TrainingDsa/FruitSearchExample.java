import java.util.ArrayList;
import java.util.List;

public class FruitSearchExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("banana");

        String targetFruit1 = "orange";
        String targetFruit2 = "mango";

        boolean isOrangePresent = containsIgnoreCase(fruits, targetFruit1);
        boolean isMangoPresent = containsIgnoreCase(fruits, targetFruit2);

        System.out.println("Is 'orange' present in the list? " + isOrangePresent);
        System.out.println("Is 'mango' present in the list? " + isMangoPresent);
    }

    private static boolean containsIgnoreCase(List<String> list, String target) {
        for (String element : list) {
            if (element.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }
}
