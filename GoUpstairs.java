public class GoUpstairs{
    public static void main(String[] args) {

    }
public int countWays(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (n == 3) return 4;
    int mod = 1000000007;
    int first = 1;
    int second = 2;
    int third = 4;
    int result = 0;
    for (int i = 4; i <= n; i++) {
        result = (first + second) % mod + third % mod;
        first = second % mod;
        //依次往后移动一位数
        second = third % mod;
        third = result;
    }
    return result % mod;
}
}