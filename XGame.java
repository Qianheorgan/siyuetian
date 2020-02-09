
import java.util.Scanner;
public class XGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);

            if (s.length() == 1) {
                if (s.equals("2") || s.equals("5") || s.equals("6") || s.equals("9")){
                    dp[i] = dp[i - 1] + 1;
                } else {
                    dp[i] = dp[i - 1];
                }
            } else {
                if (s.contains("3") || s.contains("4") || s.contains("7")) {
                    //排除3 4 7
                                dp[i] = dp[i - 1];
                } else {
                    if (s.contains("2") || s.contains("5") || s.contains("6") || s.contains("9") ) {
                        dp[i] = dp[i - 1] + 1;
                    } else {
                        dp[i] = dp[i - 1];
                    }
                }
            }
        }
        System.out.println(dp[n]);
    }
}
