import java.util.*;
public class KeepShapeNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=a*a;
        String a1=String.valueOf(a);
        String b1=String.valueOf(b);
        String c=b1.substring(b1.length()-a1.length());
        if(a==Integer.valueOf(c)){
            System.out.println("Yes!");
        }
        else{
            System.out.println("No!");
        }
    }
}