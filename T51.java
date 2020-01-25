public class T51 {
    public static void main(String[] args) {
        int[] nums={1,2,4,5,5};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;

    }
}
