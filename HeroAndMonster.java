import java.util.Arrays;
import java.util.Scanner;
//英雄与怪兽
public class HeroAndMonster {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();

        int [][] a=new int[N][M];
        System.out.println();
        System.out.println(N);
        System.out.println(M);
        for(int i=0;i<N;i++){
            String t=in.next();
            char[] c=t.toCharArray();
            for(int j=0;j<M;j++){
                a[i][j]=(int)c[j];
            }
        }

        int [][]b=new int[N][M];
        for(int n=0;n<N;n++){
            for(int m=0;m<M;m++){
                if(a[n][m]==0){
                    b[n][m]=0;
                }
                if(a[n][m]==1){
                    b[n][m]=Get(a,N,M,n,m);
                }
            }

        }
        System.out.println(Arrays.toString(b));

    }
    public static  int Get(int [][]a,int N,int M,int n,int m){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(a[i][j]==0){
                    int k=n-i;
                    int h=m-j;
                    if(k<0){
                        k=-k;
                    }
                    if(h<0){
                        h=-h;
                    }
                    if(k+h<min){
                        min=k+h;
                    }
                }
            }
        }
        return min;
    }
}
