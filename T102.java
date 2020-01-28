public class T102 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        search(nums, 0, nums.length - 1, target, result);
        return result;
    }

    private void search(int[] nums, int low, int high, int target, int[] result) {
        if (low > high) return;
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            if (result[0] == -1 || mid <= result[0]) {
                result[0] = mid;
            }
            if (mid >= result[1]) {
                result[1] = mid;
            }
            search(nums, low, mid - 1, target, result);
            search(nums, mid + 1, high, target, result);
        } else if (nums[mid] > target) {
            search(nums, low, mid - 1, target, result);
        } else {
            search(nums, mid + 1, high, target, result);
        }
    }

}