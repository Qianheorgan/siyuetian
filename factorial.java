import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(calculate(a));
    }
    public static BigInteger calculate(int a) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i < a + 1; i++) {
            BigInteger b = BigInteger.valueOf(i);
            result = result.multiply(b);
        }
        return result;
    }
}