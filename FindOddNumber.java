import java.util.*;
public class FindOddNumber{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        for(int i=0;i<n;i++){
            int s=in.nextInt();
            a=a^s;
        }
        System.out.println(a);
    }
}