import java.util.*;
public class zeroone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] a=in.nextLine().split("");
        int[] b=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i]);
        }
        int max=Integer.MIN_VALUE;
        int n=2;
        for(int i=0;i<a.length-2;i++){
            if(b[i]==1&&b[i+1]==1&&b[i+2]==0){
                 n=2;
                 continue;
            }
            n++;
            max=Math.max(max,n);
        }
        System.out.println(max);
    }
}
