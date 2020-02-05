
import java.util.*;
public class AllArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        if (!scanner.hasNext()) {
            System.out.println(str1);
            return;
        }
        int[] num1 = strToIntArr(str1);
        int[] num2 = strToIntArr(scanner.next());
        int[] num = new int[num1.length + num2.length];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < num1.length && index2 < num2.length) {
            num[index++] = (num1[index1] <= num2[index2]) ? num1[index1++] : num2[index2++];
        }
        while (index1 < num1.length) {
            num[index++] = num1[index1++];
        }
        while (index2 < num2.length) {
            num[index++] = num2[index2++];
        }
        for (int i = 0; i < num.length; i++) {
            if (i == num.length - 1) {
                System.out.println(num[i]);
            } else {
                System.out.print(num[i] + ",");
            }
        }
    }
    public static int[] strToIntArr(String str) {
        String[] strNumber = str.split(",");
        int[] number = new int[strNumber.length];
        for (int i = 0; i < strNumber.length; i++) {
            number[i] = Integer.parseInt(strNumber[i]);
        }
        return number;
    }
}