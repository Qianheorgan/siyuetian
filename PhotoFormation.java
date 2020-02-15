
import java.util.*;
public class PhotoFormation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[] chs = scanner.nextLine().toCharArray();
        int k = (n - 1) / 3;
        int area = 2 * k + 1;
        int index = 0;    
        for (int i = 0; i < area; i++) {
            if (i < k) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < area - i; j++) {
                    char c = (j == i || j == area - i - 1) ? chs[index++] : ' ';
                    sb.append(c);
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j <= k; j++) {
                    char c = (j == k) ? chs[index++] : ' ';
                    sb.append(c);
                }
                System.out.println(sb.toString());
            }
        }
    }
}