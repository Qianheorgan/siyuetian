import java.util.*;
public class MagicBox{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int a=in.nextInt();
            System.out.println(get(a));
        }

    }
    public static int get(int a){
        int count=0;
        while(a>0){
            a=a/2;
            count++;
        }
        return count;
    }
}