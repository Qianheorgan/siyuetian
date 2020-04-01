import java.util.*;


public class ProductionPhone {
    /**
     *
     * @param n int整型 第n天
     * @return int整型
     */
    public int solution (int n) {
        // write code here
        if (n < 0) return 0;
        int count = 1;
        int flag = 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + count;
            flag++;
            if (flag == count) {
                flag = 0;
                count++;
            }
        }
        return dp[n];
    }
}