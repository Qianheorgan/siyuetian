import java.util.*;
public class Bus{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i] = in.nextInt();
        if (m < a.length){
            int from = 0,to = m-1;
            while (from < a.length){
                reverse(a,from,to);
                from += m;
                to += m;
                if (to >= a.length)
                    to = a.length-1;
            }
            reverse(a,0,a.length-1);
        }
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
    public static void reverse(int[] a,int from,int to){
        int temp;
        while (from < to){
            temp = a[from];
            a[from] = a[to];
            a[to] = temp;
            from++;
            to--;
        }
    }
}