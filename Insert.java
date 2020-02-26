import java.util.Arrays;
//时间复杂度O(n^2)
public class Insert {
    public static void main(String[] args) {
        int[] array={2,4,15,6,2,6,4};
        insert(array);

    }
    public static void insert(int [] a) {
        //无序区间[i,a.length)
        //有序区间[0,i)
        int length = a.length;
        for (int i = 1; i < a.length ; i++) {
            int v = a[i];
            int j = i - 1;
            // 不写 array[j] == v 是保证排序的稳定性  
            for (; j >= 0 && a[j] > v; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
        }
        System.out.println(Arrays.toString(a));
    }
}