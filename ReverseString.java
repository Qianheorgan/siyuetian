
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
         /* dp[i][j] 表示 i...j的回文的最大长度
         dp[i][j] = dp[i+1][j-1],s[i]==s[j]
                  = max(dp[i+1][j],dp[i][j-1]),s[i]!=s[j]
                  = 1,i==j
           */
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = 1;
        }
        for (int i = s.length() - 2; i >= 0; --i) {
            for (int j = i + 1; j < s.length(); ++j) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        System.out.println(dp[0][s.length() - 1]);
    }
}