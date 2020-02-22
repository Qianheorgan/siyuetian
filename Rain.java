
import java.util.Scanner;
public class Rain{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(",");
        int[] m = new int[a.length];
        for(int i=0; i<a.length; i++) {
            m[i] = Integer.parseInt(a[i]);
        }
        int s = getSpace(m);
        System.out.println(s);
    }
    private static int getSpace(int[] m) {
        //遍历最高的柱子，获取最大高度和下标
        int max = 0;
        int max_index = 0;
        for(int i=0; i<m.length; i++) {
            if(m[i] > max) {
                max = m[i];
                max_index = i;
            }
        }
        // 从最左端遍历到max_index，计算左边的雨水面积(高度下降时计算水位)
        int sum = 0;
        int cur = 0;
        int l, r;
        for(l=0; l<max_index; l++) {
            if(cur < m[l])
                cur = m[l];
            else
                sum += (cur - m[l]);
        }
        // 从最右端遍历到max_index，计算右边的雨水面积(高度下降时计算水位)
        for(r=m.length-1,cur=m[m.length-1]; r>max_index; r--) {
            if(cur < m[r])
                cur = m[r];
            else
                sum += (cur - m[r]);
        }
        return sum;
    }
}