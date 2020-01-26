import java.util.Arrays;

public class T81 {
    public static void main(String[] args) {
        int[] a={9,9,9};
        int[]b=plusOne(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
