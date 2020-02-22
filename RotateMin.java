
import java.util.*;
public class RotateMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int[] arr = new int[1000000];
        while(sc.hasNext()) {
            arr[n ++] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        while(l < r) {
            int mid = (l + r) >>> 1;
            if(arr[mid] > arr[r]) {
                l = mid + 1;
            }
            else if(arr[mid] < arr[r]) {
                r = mid;
            }
            else {
                r = r - 1;
            }
        }
        System.out.println(arr[l]);
    }
}