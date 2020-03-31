import java.util.*;


public class SameWater {
    /**
     *
     * @param n int整型 水桶的个数
     * @param q int整型 询问的次数
     * @param a int整型一维数组 n个水桶中初始水的体积
     * @param p int整型一维数组 每次询问的值
     * @return int整型一维数组
     */
    public int[] solve (int n, int q, int[] a, int[] p) {
        int[] res=new int[q];
        Arrays.sort(a);
        for (int i = 0; i < q; i++) {
            int[] sumA=new int[n];
            sumA[0]=a[0];
            for (int x = 1; x < n; x++) {
                sumA[x]=sumA[x-1]+a[x];
            }
            int time=Integer.MAX_VALUE;
            int num=Integer.MAX_VALUE;
            int index=0;
            for (int j = 0; j <= n-p[i]; j++) {
                int tempTime=a[j+p[i]-1]*(p[i]-1)-(sumA[j+p[i]-2]-sumA[j]+a[j]);
                int tempNum=a[j+p[i]-1]*p[i];
                if(tempTime==0){
                    res[i]=0;
                    time=0;
                    break;
                }else if(tempTime<time){
                    time=tempTime;
                    num=tempNum;
                    index=j;
                }else if(tempTime==time&&tempNum<num){
                    time=tempTime;
                    num=tempNum;
                    index=j;
                }
            }
            if(time!=0){
                res[i]=time;
                for (int k = index; k < index+p[i]; k++) {
                    a[k]=a[index+p[i]-1];
                }
            }

        }
        return res;
    }
}