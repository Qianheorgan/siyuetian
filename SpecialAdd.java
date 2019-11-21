import java.util.Scanner;

public class SpecialAdd {
    public static int addAB(int A, int B) {

        int tem=0;//代表进位位
        do{
            tem=A&B;
            A=A^B;
            B=tem<<1;
        }
        while(B!=0);
        return A;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println( addAB(a,b));
    }
}
