
import java.util.Scanner;
public class LessSpeed {
       public static void main(String[] args) {
           //取输入的数据
               Scanner scanner = new Scanner(System.in);
               int n = Integer.parseInt(scanner.nextLine());
               int[][] num = new int[n][n];
               for (int i = 0; i < n; i++) {
                   String[] s = scanner.nextLine().split(",");
                   for (int j = 0; j < n; j++) {
                       num[i][j]=Integer.parseInt(s[j]);
                   }
               }
               int[][] dp= new int [n][n];
               dp[0][0]=num[0][0];
               for(int i=1;i<n;i++){
                   dp[i][0]=num[i][0]+dp[i-1][0];
                   dp[0][i]=num[0][i]+dp[0][i-1];
               }
               for(int i=1;i<n;i++)
                   for(int j=1;j<n;j++)
                       dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+num[i][j];
               System.out.println(dp[n-1][n-1]);
       }
}