import java.util.Scanner;

public class LineupSing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        insertSort(a);
        System.out.println(count);
    }
    private static int count = 0;
    //插入排序
public static void insertSort(int[] a) {
    if (a == null || a.length == 0)
        return;
    for (int j = 1; j < a.length; j++) {
        if (a[j] < a[j - 1]) {
            int i, temp = a[j];
            for (i = j - 1; i >= 0 && a[i] > temp; i--) {
                a[i + 1] = a[i];
                count++;
            }
            a[++i] = temp;
        }
    }
}
}
