
import java.util.Scanner;
public class LessCubicAdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int temp = 1, preMin = Integer.MAX_VALUE;
            while (temp * temp * temp <= i) {
                preMin = Math.min(preMin, dp[i - temp * temp * temp]);
                temp++;
            }
            dp[i] = preMin + 1;
        }
        System.out.println(dp[n]);
    }
}