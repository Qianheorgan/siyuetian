
import java.math.BigInteger;
import java.util.Scanner;
public class StringMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bi1 = new BigInteger(scanner.next());
        BigInteger bi2 = new BigInteger(scanner.next());
        System.out.println(bi1.multiply(bi2));
    }
}