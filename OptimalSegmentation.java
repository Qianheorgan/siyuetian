
// 结果在（max(nums),sum(nums))之间，使用二分查找
// 以[7,2,5,10,8]举例，开始假设只有一个子数组,set=1
// 第一个 mid = (10+32)/2=21, 然后把数字一个一个塞进去
// 先塞7, 7<21, 7+2<21, 7+2+5<21, 直到 7+2+5+10>21
// 意味着一个数组放不下, set+1=2, 然后把后面的塞完
// 如果比m大说明我们开的子数组太多, 也就意味值我们数组容量(mid)太小
// 所以我们就从[22,32]区间中找, 否则在[10,21]中找
import java.util.Scanner;
public class OptimalSegmentation {
    public static int splitArray(int[] nums, int m) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i : nums){
            sum += i;
            max = Math.max(max,i);
        }
        int left = max, right = sum;
        int mid, set, cur;
        while(left < right){
            mid = (left+right)/2;
            // m 是子数组数，不是cut数
            set = 1;
            cur = 0;
            for(int i : nums){
                if(cur+i > mid){
                    set++;
                    cur = 0;
                }
                cur+= i;
            }
            if(set > m) left = mid + 1;
            else right = mid;
        }
        return left;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(splitArray(nums,m));
    }
}