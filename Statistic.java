import java.util.Scanner;

//统计一个数里面每个数字出现的次数
public class Statistic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.next();
        for(int i = 0;i<n.length();i++)
            a[n.charAt(i)-'0']++;//********************
        for(int i = 0;i<a.length;i++)
            if(a[i]!=0)

                System.out.println(i+":"+a[i]);
    }
    }
