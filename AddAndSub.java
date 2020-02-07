
import java.util.*;
public class AddAndSub{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        int i = 0;
        int temp = 0;
        //以数字开头时加一个+，让其以+开头
            if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                str = "+" + str;
            }
            while (i < str.length()) {
                //每次进循环时都是以+或-开头
                       if (str.charAt(i) == '+') {
                           i++;
                           while (i < str.length() && str.charAt(i) != '+' && str.charAt(i) != '-') {
                               int q = str.charAt(i) - '0';
                               temp = temp * 10 + q;
                               i++;
                           }
                           res += temp;
                           temp = 0;
                       }
                       else {
                           i++;
                           while (i < str.length() && str.charAt(i) != '+' && str.charAt(i) != '-') {
                               int q = str.charAt(i) - '0';
                               temp = temp * 10 + q;
                               i++;
                           }
                           res -= temp;
                           temp = 0;
                       }
            }
            System.out.println(res);
    }
}