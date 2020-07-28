import java.util.Scanner;

public class PublicCode {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=Get(a,b);
        System.out.println(c);
    }
    public  static int  Get(int a,int b){
        if(a==b){
            return a;
        }
        while(a>1&&b>1){
            if(a==b){
                return a;
            }
            if(a>b){
                a/=2;
                continue;
            }
            if(a<b){
                b/=2;
                continue;
            }

        }
        return 1;
    }
}
