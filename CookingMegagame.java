
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CookingMegagame{
    /**     * 分糖果类型题
     * * 首先从左往右遍历一遍数组，我分数比你高，那我必须比你多一千块,这样便利一遍就能确保相对于左边满足了条件
     * * 在从右边往左边遍历一遍，我比你分数高，但是我的钱跟你一样甚至比你少，我必须要比你多1000块
     * * 两边遍历后就分配好了
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int[] score = new int[n];
        int[] money = new int[n];
        for (int i = 0; i < n; i++) {            
            score[i] = Integer.parseInt(line1[i + 1]);
            //从左往右遍历，如果i比i-1的分数高，那我的钱一定要比你多
            if (i > 0 && score[i] > score[i - 1]) {
                money[i] = money[i - 1] + 1;
            }
        }
        //在从右往左遍历
        int sum = n;
        for (int i = n - 2; i >= 0; i--) {
            if (score[i] > score[i + 1] && money[i] <= money[i + 1]) {
                money[i] = Math.max(money[i], money[i + 1] + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            sum += money[i];
        }
        System.out.println(sum);
    }
}