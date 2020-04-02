
import java.util.*;
public class GiftAdd
{
    /**     *      * @param presentVec int整型一维数组 每个礼物的价值
     *  * @return int整型
     *  */
    public int maxPresent (int[] presentVec) {
             int n = presentVec.length;
             if(n == 0) return 0;
             int sum = 0;
             for(int i = 0; i < n; i++){
                 sum += presentVec[i];
             }        //简化为背包问题
        int v = (sum + 1) / 2;
             int[] dp = new int[v+1];
             for(int i = 0; i < n; i++){
                 int p = presentVec[i];
                 for(int j = v; j >= p; j--){
                     dp[j] = Math.max(dp[j], dp[j-p]+p);
                 }
             }
             int result = 2*dp[v] - sum;
             return  result >= 0 ? result : -result;
    }
}