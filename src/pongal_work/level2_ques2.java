package pongal_work;

public class level2_ques2 {
    public static void main(String[] args) {
        int n = 1234;
        String input = Long.toString(n);
        int numberOfDigits = input.length();
        long sum = 0;

        for (int i = 0; i < numberOfDigits; i++) {
            long digit = Character.getNumericValue(input.charAt(i));
            sum += Math.pow(digit, numberOfDigits);
        }
        System.out.println(sum);
    }
}
