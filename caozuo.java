import java.util.*;
public class caozuo {




    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x1=in.nextInt();
        int y1=in.nextInt();
        int z1=in.nextInt();
        int n=in.nextInt();    int m=in.nextInt();
        int q=in.nextInt();
        int [][]a=new int[q][2];
        for(int i=0;i<q;i++){
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        for(int i=0;i<q;i++){
            int a1=a[i][0];
            int b=a[i][1];
//            System.out.println(a1);
//            System.out.println(b);
            int x=x1;
            int y=y1;
            int z=z1;
            int n1=n;
            int m1=m;
//            System.out.println(n1);
//            System.out.println(m1);
            int [] u=new int[4];
            while(x-->0){
               u= X(a1,b,n1,m1);
                System.out.println(Arrays.toString(u));
            }
            while(y-->0){
                u[1]=Y(u[1],u[3]); System.out.println(Arrays.toString(u));
            }
            while(z-->0){
                u=Z(u); System.out.println(Arrays.toString(u));
            }
            System.out.println( u[0]+" "+ u[1]);
        }
    }
    public static int[]   X(int a,int b,int n,int m){

        a=b;
        b=m-b;
        int w=n;
        n=m;
        m=w;
        int [] t=new int[4];
        t[0]=a;
        t[1]=b;t[2]=n;t[3]=m;
        return t;
    }
    public static int  Y(int b,int m){
        b=m+1-b;
        return b;

    }
    public static int[] Z(int[]u){

        int a=u[0];int b=u[1];int n=u[2];int m=u[3];
        b=a;
        a=n-b;
        int w=n;
        n=m;
        m=w;
        int [] t=new int[4];
        t[0]=a;
        t[1]=b;t[2]=n;t[3]=m;

        return t;
    }
}
