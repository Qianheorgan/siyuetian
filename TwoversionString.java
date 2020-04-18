
import java.util.Scanner;
public class TwoversionString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] v1 = sc.next().split("\\.");
        String[] v2 = sc.next().split("\\.");
        int len = Math.max(v1.length, v2.length);
        int[] num1 = new int[len];
        int[] num2 = new int[len];
        for (int i = 0; i < v1.length; i++) {
            num1[i] = Integer.parseInt(v1[i]);
        }
        for (int i = 0; i < v2.length; i++) {
            num2[i] = Integer.parseInt(v2[i]);
        }
        int index = 0;
        while (index < len) {
            if (num1[index] < num2[index]) {
                System.out.println(-1);
                return;
            } else if (num1[index] > num2[index]) {
                System.out.println(1);
                return;
            } else {
                index++;
            }
        }
        System.out.println(0);
    }
}