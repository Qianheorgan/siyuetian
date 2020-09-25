import java.util.*;
public class Zhiyinshu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int sum=0;
        while(get(n)!=-1){
            sum++;
             int b=get(n);
             n=n/b;

        }
        System.out.println(sum+1);
    }
    public static  int get(int n){
        int a=(int)Math.sqrt( n);
        for(int i=2;i<=a;i++){
            if(n%i==0){
                return i;
            }

        }
        return -1;
    }
}
