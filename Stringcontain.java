
import java.util.*;
public class Stringcontain{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            boolean flag = false;
            String s1 = in.next();
            String s2 = in.next();
            int len1 = s1.length();
            int len2 = s2.length();
            for (int i = 1; i <= len1; i++)
                for (int j = 0; j < i; j++) {
                if (s2.equals(s1.substring(j, i))) {
                    System.out.println(1);
                    flag = true;
                }
            }
            if (!flag)
                for (int i = 1; i <= len2; i++)
                    for (int j = 0; j < i; j++) {
                if (s1.equals(s2.substring(j, i))) {
                    System.out.println(1);
                    flag = true;
                }
            }
            if (!flag)
                System.out.println(0);
        }
    }
}