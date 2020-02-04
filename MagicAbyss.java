
import java.util.*;
public class MagicAbyss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int[] dp = new int[1001];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= 1000; i++) {
            int tmp = 1;
            while (tmp <= i) {
                dp[i] += dp[i - tmp];
                tmp *= 2;
                dp[i] %= 1000000000 + 3;
            }
        }
        while (T-- > 0) {
            int n = in.nextInt();
            System.out.println(dp[n]);
        }
    }
}