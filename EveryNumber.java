import java.util.*;


public class EveryNumber {
    /**
     * 输入一个整形数值，返回一个整形值
     * @param n int整型 n>9
     * @return int整型
     */
    public int solution (int n) {
        List<Integer> m = new ArrayList<>();
        if (n < 10){
            return 10 + n;
        }

        while (n >= 10){
            for (int i = 9; i >= 2; i--) {
                if (0 == n % i){
                    m.add(i);
                    n = n / i;
                    break;
                }
                if (2 == i) return -1;
            }
        }

        m.add(n);
        int ans = 0;
//          System.out.println(m);
        for (int i = 0; i < m.size(); i++) {
            ans += m.get(i) * Math.pow(10, i);
        }
        return ans;
    }
}