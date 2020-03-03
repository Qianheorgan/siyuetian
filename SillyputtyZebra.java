
import java.util.*;
public class SillyputtyZebra {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input += input;
        char[] s = input.toCharArray();
        int cur = 1, max = 0;
        for (int i = 0; i < s.length - 1; i++) {
            if (s[i] != s[i+1]) {
                cur += 1;
            } else {
                if (cur > max) {
                    max = cur;
                }
                cur = 1;
            }
        }
        System.out.println(max);
    }
}