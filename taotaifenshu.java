import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Arrays;
import java.util.Scanner;

public class taotaifenshu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();int x=in.nextInt();int y=in.nextInt();
        int[] a=new int[n];
       // System.out.println(x);
        //System.out.println(y);
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
            //System.out.println(a[i]);
        }
        if(n<x*2||n>y*2){
            System.out.println(-1);
            return ;
        }
            int c=0;
           int b=0;
            for(int j=x;j<=y;j++){
              b=6-j;
             if(b>=x&&b<=y){
                    c=j;
                    break;
                }
            }

        Arrays.sort(a);
        System.out.println(a[b-1]);
    }
}
