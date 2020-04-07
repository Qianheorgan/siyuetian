import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if(n==1){
            System.out.println(-1);
            System.exit(0);
        }
        long[] a=new long[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextLong();
        }

       long [] b=new long[n-1];
        for(int j=0;j<n-1;j++){
            b[j]=a[j+1]-a[j];
            if(b[j]<=0){
                System.out.println(-1);
                System.exit(0);
            }
        }
        long c=b[0];
             for(int m=1;m<n-1;m++){
                   long d=b[m];
                   long e=d%c;
                 while(e!=0){
                      d=c;
                      c=d%c;
                      e=d%c;
                 }
             }
        System.out.println(c);
    }
}
