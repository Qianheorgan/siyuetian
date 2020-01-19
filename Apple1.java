import java.util.*;
public class Apple1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        a[0] = sc.nextInt();
        for(int i=1;i<n;i++){
            a[i] = a[i-1]+sc.nextInt();
        }
        int m = sc.nextInt();
        int[] q = new int[m];
        for(int i=0;i<m;i++){
            q[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            int left=0,right=n-1;
            while(left+1!=right){
                int mid = (left+right)>>1;
                if(q[i]<=a[mid])right=mid;
                else left=mid;
            }
            System.out.println(q[i]>a[left]?right+1:left+1);
        }
    }
}