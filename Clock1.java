
import java.util.Scanner;
public class Clock1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; ++ i) {
            String input = scanner.next();
            String[] strs = input.split(":");
            int h = Integer.parseInt(strs[0]);
            if (h > 23) {
                strs[0] = "0" + strs[0].charAt(1);
            }
            int m = Integer.parseInt(strs[1]);
            if (m > 59) {
                strs[1] = "0" + strs[1].charAt(1);
            }
            int s = Integer.parseInt(strs[2]);
            if (s > 59) {
                strs[2] = "0" + strs[2].charAt(1);
            }
            System.out.println(strs[0] + ":" + strs[1] + ":" + strs[2]);
        }
    }
}