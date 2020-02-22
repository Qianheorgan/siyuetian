
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SequenceN {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bf.readLine());
        //one表示第n-1层的数字个数，two表示第n层的数字个数，sum表示第n层的总数字个数
        // 如果 sum + two的个数大于等于n，则前一层所有个数就是sum，直接return
        long one = 0, two = 1, sum = 0;
        while (sum < n) {
            long temp = one + two;
            one = two;
            two = temp;
            if (sum + one >=n) {
                System.out.println(sum);
                return;
            } else {
                sum += one;
            }
        }
    }
}