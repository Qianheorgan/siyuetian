
public class ArrayGetAdd{
    /**     * 计算有多少对符合条件的数对
     *  * @param a int整型一维数组 数组a
     *  * @param b int整型一维数组 数组b
     *  * @return int整型     */
    public int countLR (int[] a, int[] b) {
            int count = 0;
            int len = a.length;
            for(int i = 0;i<len;i++){
                if(a[i] == 2*b[i]) count++;
            }
            for(int low = 0;low < len-1;low++){
                int x = a[low];
                for(int fast=low+1;fast<len;fast++){
                    int y = b[low] + b[fast];
                    x += a[fast];
                    if(x == y) count++;
                }
            }
            return count;
    }
}