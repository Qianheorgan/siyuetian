
import java.util.*;
public class Thechange{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = 1024-sc.nextInt();
            int[]coins={1,4,16,64};
            int max=n+1;
            int[]dp=new int[max+1];
            Arrays.fill(dp,max);
            dp[0]=0;
            for(int i=1;i<=n;i++){
                for(int coin:coins){
                    if(i>=coin)dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
            System.out.println(dp[n]);


        }
    }
}