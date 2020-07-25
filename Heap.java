import java.util.Arrays;
//堆排序
public class Heap {
    public static void main(String[] args) {
        int[] array={4,72,7,3,9,8,5};
        heap(array);

    }
    public  static  void heap(int [] a){
        createheap(a);
        for(int i=0;i<a.length-1;i++){
         swap(a,0,a.length-1-i);
         shiftDown(a,a.length-i-2,0);
        }
        System.out.println(Arrays.toString(a));
    }
    private static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    private  static void createheap(int [] a){
        for (int i = (a.length - 1) / 2; i >= 0; i--) {
            shiftDown(a, a.length, i);
        }
    }
    public static void shiftDown(int[] a,int size,int index){
        int left=2*index+1;
        while(left<size){
            int max=left;
            int right=2*index+2;
            if(a[right]>a[left]){
                max=right;

            }
            if(a[index]>a[max]){
                break;
            }
            int t=a[index];
            a[index]=a[max];
            a[max]=t;

            index=max;
            left=2*index+1;
        }
    }
}
