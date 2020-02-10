
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Candy1{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        String[] line2 = bf.readLine().split(" ");
        int[] g = new int[line1.length];
        int[] s = new int[line2.length];
        for (int i = 0; i < line1.length; i++) {
            g[i] = Integer.parseInt(line1[i]);
        }
        for (int i = 0; i < line2.length; i++) {
            s[i] = Integer.parseInt(line2[i]);
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int p1 = 0, p2 = 0;
        while (p1 < g.length && p2 < s.length) {
            if (s[p2] >= g[p1]) {
                p1++;
                p2++;
                count++;
            } else {
                p2++;
            }
        }
        System.out.println(count);
    }
}