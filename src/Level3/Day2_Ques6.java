package Level3;

public class Day2_Ques6 {
    public static void main(String[] args) {
        String input = "Hello, World!";

        String result = convertToUppercase(input);

        System.out.println( input);
        System.out.println(result);
    }
    static String convertToUppercase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (currentChar >= 'a' && currentChar <= 'z') {
                chars[i] = (char) (currentChar - ('a' - 'A'));
            }
        }

        return new String(chars);
    }
}
