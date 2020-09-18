import java.util.*;
public class Trip{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [][] a=new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                a[i][j]=in.nextInt();
            }
        }
        int b=0;
        double min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int s=a[i+1][0]-a[i][0];
            int x=a[i+1][1]-a[i][1];
            int y=a[i+1][2]-a[i][2];
            int z=a[i=1][3]-a[i][3];
            double e=Math.sqrt(x*x+y*y+z*z);
            double w=e/s;

            if(w<min){
                min=w;
                b=i;
            }
        }
        System.out.println(b);
    }
}