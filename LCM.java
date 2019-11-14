import java.util.Scanner;

public class LCM {
    public static int gcd(int m,int n){
        while(m%n!=0){
            int temp=m;
            m=n;
            n=temp%n;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int c=gcd(a,b);
        System.out.println((a*b)/ c);
    }
}
