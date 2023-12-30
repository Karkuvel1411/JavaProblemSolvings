package Level3;

public class oues1 {
    public static void main(String[] args) {
        int n = 4;
        String res;
        for (int i = 1; i <= n; i++) {
            res = " ";
            for (int j = 1; j <= i; j++) {
                res += j + " ";
            }
            System.out.println(res);
        }
    }
}
