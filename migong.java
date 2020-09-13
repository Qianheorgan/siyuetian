import java.util.*;
public class migong{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        in.nextLine();
        String[] t=new String[N];
        for(int f=0;f<N;f++){
            t[f]=in.nextLine();

        }
       // System.out.println(Arrays.toString(t));
        String  [][]a=new String[N][N];
        for(int i=0;i<N;i++){
            String[] g=t[i].split("");
           // System.out.println(Arrays.toString(g));
            for(int j=0;j<N;j++){
                 a[i][j]=g[j];
            }
        }

        int[][]a1=new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                if(i==0&&j==0){
                    continue;
                }
                if(a[i][j].equals("0")){
                    a1[i][j]=1;
                }
                if(a[i][j].equals("#")){
                    a1[i][j]=K;
                }
                if(a[i][j].equals("1")){
                    a1[i][j]=-1;
                }
            }
        }
//        for(int i=0;i<N;i++){
//            for(int j=0;j<N;j++){
//                System.out.println(a1[i][j]);
//            }
//        }
        System.out.println(get(a1,N));
    }
    public static int get(int [][]a1,int N){
        int dp[][]=new int[N][N];

        for(int i=0;i<N;i++){

            for(int j=0;j<N;j++){

                if(a1[i][j]<0){
                    dp[i][j]=Integer.MAX_VALUE;
                    continue;
                }
                if(i==0){

                    if(j==0){

                        dp[i][j]=a1[i][j];

                    }else{

                        dp[i][j]=dp[i][j-1]+a1[i][j];

                    }

                }else{

                    if(j==0){

                        dp[i][j]=dp[i-1][j]+a1[i][j];

                    }else{

                        dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+a1[i][j];

                    }

                }

            }

        }

       return dp[N-1][N-1];

    }
}



