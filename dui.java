import java.util.*;
public class dui {
    public static void main(String[] args) {
        int[] array1 = {100, 50, 30, 25, 40, 80, 70, 0, 50, 5, 20, 30, 60, 70, 60, 7};
        shiftDown(array1, 2);
        System.out.println(Arrays.toString(array1));
    }

    public static void shiftDown(int [] array,int index) {
        int size = array.length;
        int left = 2 * index + 1;
        while (left < size) {
            int right = left + 1;
            int max = left;
            if (right < size) {
                if (right > left) {
                    max = right;
                }
            }
            if (index <= max) {
                //swap(array,max,index);
                int t=array[max];
                array[max]=array[index];
                array[index]=t;
                max = index;
                left = 2 * index + 1;
            } else {
                break;
            }

        }

        }
    }
