public class NumberHow {
    private int upper_bound(int[] array, int val) {
        int l = 0, r = array.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            if (array[mid] <= val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    private int lower_bound(int[] array, int val) {
        int l = 0, r = array.length - 1, mid;
        while (l <= r) {
            mid = (l + r) >> 1;
            if (array[mid] < val) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
    public int GetNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int lowerIndex = lower_bound(array, k);
        int upperIndex = upper_bound(array, k);
        return upperIndex - lowerIndex;
    }
}
