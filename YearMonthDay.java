import java.util.*;
public class YearMonthDay{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mons = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        while (in.hasNext()) {
            int year = in.nextInt();
            int month = in.nextInt();
            int day = in.nextInt();
            if (isLeap(year)) mons[2] = 29;
            int ans = 0;
            for (int i = 1; i < month; i++) {
                ans += mons[i];
            }
            ans += day;
            System.out.println(ans);
        }
    }
    static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }
}