
import java.util.*;
public class SmallCargoproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {3, 5, 7};
        int[] dp = new int[n + 1];
        Arrays.fill(dp, n + 1);
        dp[0] = 0;
        for(int i = 1; i <= n; i ++) {
            for(int a : arr) {
                if(i >= a) {
                    dp[i] = Math.min(dp[i], dp[i - a] + 1);
                }
            }
        }
        System.out.println(dp[n] > n ? -1 : dp[n]);
    }
}