import java.util.ArrayList;

public class ArrayAdd {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> p = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            int low = i + 1;
            int hight = array.length;
            int mid;
            Boolean f = false;
            while (low < hight) {
                mid = (low + hight) / 2;
                if (array[i] + array[mid] == sum) {
                    p.add(array[i]);
                    p.add(array[mid]);
                    f = true;
                    break;
                } else if (array[i] + array[mid] > sum) {
                    hight = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            if (f == true) {
                break;
            }
        }
        return p;     }
    }


