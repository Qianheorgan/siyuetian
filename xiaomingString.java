
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class xiaomingString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);
        String str = br.readLine();
        for (int i = 0; i < t; i++) {
            String[] s1 = br.readLine().split(" ");
            int type = Integer.parseInt(s1[0]);
            int x = Integer.parseInt(s1[1]);
            if (type == 1) {
                str = str.substring(n - x) + str.substring(0, n - x);
            } else {
                System.out.println(str.charAt(x));
            }
        }
    }
}