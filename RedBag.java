import java.util.Arrays;
//微信红包
public class RedBag {
    public static void main(String[] args) {
        int[]a ={1,2,3,2,2};
        System.out.println(getValue(a, a.length));
    }
    public static int getValue(int[] gifts, int n) {

        Arrays.sort(gifts);
        int ans = gifts[n/2];
        int num = 0;
        for(int i = 0; i < gifts.length; i++) {
            if(gifts[i] == ans) {
                num++;
            }
        }
        return num <= n/2 ? 0 : ans;
    }

}
