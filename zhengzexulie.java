import java.util.Arrays;
import java.util.Scanner;

public class zhengzexulie {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]<1 ){
                 sum+=(1-a[i]);
                 a[i]=1;
            }
            if(a[i]>5){
                sum+=(a[i]-5);
                a[i]=5;
            }
        }
        System.out.println(sum);
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]!=(i+1)){
                 int b=a[i]-(i+1);
                //System.out.println(b);
                 sum+=Math.abs(b);
            }
        }
        System.out.println(sum);
    }
}
