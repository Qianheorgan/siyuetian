import java.util.*;


public class Cake {
    /**
     *
     * @param n int整型 只剩下一只蛋糕的时候是在第n天发生的．
     * @return int整型
     */
    public int cakeNumber (int n) {
        // write code here
        int sum=1;
        for(int i=n;i>1;i--){
            sum=(sum+1)*3;
            sum=sum/2;
        }
        return  sum;
    }
}