
import java.util.Scanner;
public class SystemConversion{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(radix(x, k));
    }
    private static String radix(long x, long k) {
        StringBuilder sb = new StringBuilder();
        if (x == 0) {
            sb.append(0);      
        }
        while (x != 0) {
            sb.append(x % k);
            x /= k;
        }
        return sb.reverse().toString();
    }
}