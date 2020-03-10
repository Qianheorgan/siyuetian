
import java.util.*;
public class EqualSequence{
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n;
        int[] arr;
        for(int i=0;i<k;i++)        {
            n = sc.nextInt();
            arr = new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j] = sc.nextInt();
            }
            if(arr.length<=2)            {
                System.out.println("YES");
            }
            else{
                if(cando(arr))
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
        }
        static boolean cando(int[] arr)    {
        int max = max(arr);
        int min = min(arr);
        if((max-min)%2!=0)        {
            return false;
        }
        int x = (max-min)/2;
        int flag = x+min;
        for(int i=0;i<arr.length;i++)        {
            if(arr[i]!=min && arr[i]!=max && arr[i]!=flag)            {
                return false;
            }
        }
        return true;    }
        static int max(int[] arr)    {
        int out = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)        {
            out = Math.max(out,arr[i]);
        }
        return out;
    }    static int min(int[] arr)    {
        int out = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)        {
            out = Math.min(out,arr[i]);
        }
        return out;
    }
}