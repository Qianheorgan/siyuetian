
import java.util.*;
public class TrainStation {
    /**     题目关键是【它在沿途的所有城市都会停靠（显然不包括起点Yi，但是包括终点Xi）】
     *  2到5表示3，4，5都会有一个站台，最后求站台数量最多的一个点。
     *  解题思路：主要是起点和终点，记录起点2，然后3，4都是1，5终点就减一变成0，
     *  这样子其实变成了【包括起点，不包括终点】，题意是【不包括起点，包括终点】，
     *  形式变了一点，但是最后结果也是一样的     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] city = new int[100001];
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            city[x]++;
            city[y]--;
        }
        int count = 0;
        int res = 0;
        for (int i = 1; i < city.length; i++) {
            count+= city[i];
            res = Math.max(res, count);
        }
        System.out.println(res);
    }
}