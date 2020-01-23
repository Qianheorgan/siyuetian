public class T22 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length -1;
        int mid;
        if(nums[high]<target){
            return nums.length;
        }

        while (low<high){
            mid = low + ((high-low)>>1);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid;
            }else {
                low = mid+1;
            }

        }
        return low;
    }
}
