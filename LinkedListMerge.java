 import java.util.*;
public class LinkedListMerge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] s1 = in.nextLine().split(" ");
        String[] s2 = in.nextLine().split(" ");
        int[] a = new int[s1.length];
        int[] b = new int[s2.length];
        int[] t = new int[s1.length+s2.length];
        for (int i=0;i<s1.length;i++){
            a[i] = Integer.parseInt(s1[i]);
        }
        for (int i=0;i<s2.length;i++){
            b[i] = Integer.parseInt(s2[i]);
        }
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if (a[i] < b[j])
                t[k++] = a[i++];
            else
                t[k++] = b[j++];
        }
        while (i < a.length)
            t[k++] = a[i++];
        while (j < b.length)
            t[k++] = b[j++];
        for(i=0;i<t.length;i++)
            System.out.print(t[i]+" ");
    }
}