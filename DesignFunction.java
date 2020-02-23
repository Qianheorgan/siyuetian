
import java.util.*;
public class DesignFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] string = str.split(",");
        int[] num = new int[string.length];
        for (int i = 0; i < string.length; i++){
            num[i] = Integer.parseInt(string[i]);
        }
        System.out.println(twoSum(num));
    }
    public static int twoSum(int[] arr){
        int len = arr.length;
        int total = 0;
        for (int i = 0; i < len - 2; i++){
            for (int j = i + 1; j < len - 1; j++){
                if (arr[len - 1] - arr[i] == arr[j]){
                    total += i + j;
                }
            }
        }
        return total;
    }
}