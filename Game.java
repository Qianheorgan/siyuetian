import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();//游戏数量
        int c=in.nextInt();//总天数
        int [] a1=new int[a+1];
        int [] a2=new int[a+1 ];
        for(int i=1;i<=a;i++){
            a1[i]=in.nextInt();//成就
            a2[i]=in.nextInt();//天数
        }
           int b=Solution(a,a2,a1,c);
        System.out.println(b);

    }
   public  static int Solution(int a,int[] a2,int[] a1,int c) {
        int[][] dp = new int[a+1][c+1];
        for(int k=1;k<=a;k++) {
            for(int p=1;p<=c;p++) {
                if(p>=a2[k]) {//如果当前总天数大于当前游戏的天数
                    dp[k][p] = Math.max(dp[k-1][p-a2[k]]+a1[k], dp[k-1][p]);
                }else {//如果总天数小于当前游戏天数，不能放
                    dp[k][p] = dp[k-1][p];
                }
            }
        }
        return dp[a][c];
    }
}

