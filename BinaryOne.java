import java.util.*;
public class BinaryOne{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        while(n>=1){
            if(n%2==1){
                count++;
            }
            n=n/2;
        }
        System.out.println(count);
    }
}