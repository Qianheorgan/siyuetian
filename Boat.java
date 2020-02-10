
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Boat{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        int n = line1.length;
        int limit = Integer.parseInt(bf.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line1[i]);
        }
        Arrays.sort(nums);
        int count = 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            if (nums[left] + nums[right] > limit) {
                //两个人装不下，只能装后面那个胖子，右边指针左移
                count++;
                right--;
            } else {

                //能装下，左右指针都移动
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
