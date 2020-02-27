 import java.util.*;
public class BigNewInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int remove = Integer.parseInt(str[1]);
        char[] num = str[0].toCharArray();
        int n = str[0].length();
        int[][] dp = new int[n][n];
        //num数组i~j范围内的最大值
         for (int i = 0; i < n; i++) {
             dp[i][i] = num[i] - '0';
         }
         for (int i = 0; i < n; i++) {
             for (int j = i + 1; j < n; j++) {
                 dp[i][j] = Math.max(dp[i][j - 1], num[j] - '0');
             }
         }
         final int choose = n - remove;
         int choosed = 0;
         StringBuilder ans = new StringBuilder();
         int st = 0, ed = n - choose;
         while (choosed < choose) {
             int max = dp[st][ed];
             //每次选取st~ed的最大值
               int t = 0;
               for (int i = st; i <= ed; i++) {
                   if(num[i] - '0' == max) {
                       //找到st~ed内最大值的下标
                                       t = i;
                                       ans.append(num[i]);
                                       choosed++;
                                       break;
                   }
               }
               //调整范围
              st = t + 1;
               ed = n - (choose - choosed);
         }
         System.out.println(ans.toString());
    }
}