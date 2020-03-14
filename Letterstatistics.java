
import java.util.Scanner;
public class Letterstatistics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] array = scanner.nextLine().toCharArray();
        int[] record = new int[256];
        for (char c : array) {
            record[c]++;
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i+":"+record[i]);
        }
    }
}