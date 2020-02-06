
import java.util.*;
public class ReverserSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        int[] dp = new int[len + 1];
        //表示前i个字符中有多少个回文子串。
         dp[0] = 0;
         dp[1] = 1;
         int cnt = 0;
         //记新加一个字符增加的回文子串数量。
              for (int i = 2; i <= len; i++) {
                  cnt = 0;
                  for (int loc = 0; loc < i - 1; loc++) {
                      if (s.charAt(loc) == s.charAt(i - 1)) {
                          if (isBackString(s.substring(loc, i)))
                              cnt++;
                      }
                  }
                  dp[i] = dp[i - 1] + cnt + 1;
              }
              System.out.println(dp[len]);
    }
    static boolean isBackString(String s) {
        int len = s.length();
        int head = 0;
        int end = len - 1;
        while (head < end) {
            if (s.charAt(head) != s.charAt(end))
                return false;
            head++;
            end--;
        }
        return true;
    }
}