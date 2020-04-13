import java.util.*;
public class WaterFlower{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        long[][] flowers = new long[n][2];
        for (int i = 0; i < n; i ++) {
            flowers[i][0] = in.nextLong();
            flowers[i][1] = in.nextLong();
        }
        TreeMap<Long, Long> map = new TreeMap<>();
        for (long[] f : flowers) {
            long key = (f[0] - x1) * (f[0] - x1) + (f[1] - y1) * (f[1] - y1);
            long val = (f[0] - x2) * (f[0] - x2) + (f[1] - y2) * (f[1] - y2);
            map.put(key, val);
        }
        long rOne = map.lastKey();
        long rTwo = 0;
        long res = rOne + rTwo;
        while (!map.isEmpty()) {
            rTwo = Math.max(map.pollLastEntry().getValue(), rTwo);
            rOne = map.isEmpty() ? 0 : map.lastKey();
            if (res >= rOne + rTwo) {
                res = rOne + rTwo;
            }
        }
        System.out.println(res);
    }
}