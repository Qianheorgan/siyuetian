
import java.util.*;
public class MidNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] array=new int[n];
        int left=0;
        int right=0;
        int xcount=0;
        int result=0;
        for(int i=0;i<n;i++)
        {
            int num = sc.nextInt();
            if(num==x)
                xcount++;
            else if(num<x)
                left++;
            else if(num>x)
                right++;
        }
        if(xcount==0)        {
            xcount++;
            result++;
        }
        if(left+xcount<right)        {
            result+=(right-(left+xcount));
            System.out.println(result);
            return;
        }
        else if(left>=right+xcount)        {
            result+=(left-(right+xcount)+1);
            System.out.println(result);
            return;
        }
        else        {
            System.out.println(result);
            return;
        }
    }
}