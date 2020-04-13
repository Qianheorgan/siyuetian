import java.util.Scanner;
public class LongAllOne{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = scanner.nextInt();
        }
        int left = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == 0) {
                K--;
                while (K < 0) {
                    if (nums[left] == 0) {
                        K++;
                    }
                    left++;
                }
            }
            max=Math.max(i-left+1,max);
        }
        System.out.println(max);
    }
}