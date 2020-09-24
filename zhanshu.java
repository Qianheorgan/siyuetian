import java.util.*;
public class zhanshu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=a[i]/3;
        }
        int m=0;
        int j=n-1;
         for(int i=n-2;i>=0;i--){
             if(j<0){
                 break;
             }
                if(b[j]>=a[i]){
                    m++;
                    j--;

                    continue;
                }

         }
        System.out.println(n-m);

    }
}
