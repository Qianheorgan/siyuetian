import java.util.*;


public class b{
    public static void main(String[] args) {
        int[][]b={{2,8,4},{2,5,0},{10,9,8}};
        int [][]c={{2,11,3},{15,10,7},{9,17,12},{8,1,14}};
        int[] a=getTriggerTime(b,c);
        System.out.println(Arrays.toString(a));
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * func getTriggerTime(increase [][]int, requirements [][]int) []int
     * @param increase int整型二维数组 属性增加值
     * @param requirements int整型二维数组 剧情触发要求
     * @return int整型一维数组
     */
    public static int[] getTriggerTime (int[][] increase, int[][] requirements) {
        // write code here
        int len=requirements.length;

        int[] a=new int[len];
        for(int i=0;i<len;i++){
            a[i]=-1;
        }

        for(int i=0;i<len;i++){
            int b=requirements[i][0];int c=requirements[i][1];int d=requirements[i][2];
            int q=get(increase,b,c,d);
            if(q>0){
                a[i]=q;
            }

        }

        return a;
    }
    public static int get(int [][]p,int b,int c,int d){
        int b1=0;int c1=0;int d1=0;
        for(int i=0;i<p.length;i++){
            b1+=p[i][0];
            c1+=p[i][1];
            d1+=p[i][2];
            if(b1>=b){
                if(c1>=c){
                    if(d1>=d){
                        return i+1;
                    }
                }
            }

        }
        return -1;

    }

}