

import java.util.*;
public class Clock{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h=0,m=0;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            h = sc.nextInt();
            m = sc.nextInt();
            a[i] = h*60+m;
        }
        int t = sc.nextInt();
        h = sc.nextInt();
        m = sc.nextInt();
        int p = h*60+m-t;
        Arrays.sort(a);
        t = Arrays.binarySearch(a,p);
        if(t <0) t = -(t+2);
        h = a[t]/60;
        m = a[t]%60;
        System.out.print(h+" "+m);
    }
}