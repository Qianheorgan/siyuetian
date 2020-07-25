import java.util.Arrays;

//快速排序
public class Quick {
    public static void main(String[] args) {
        int[] array={4,72,7,3,9,8,5};
        quick(array);

    }
    public static  void quick(int [] a){
        quickInternal(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static  void quickInternal(int [] a,int left, int right){
        if(left>=right){
            return;
        }
        int index=partition(a,left,right);
        quickInternal(a,left,index-1);
        quickInternal(a,index+1,right);
    }
    public static int partition(int [] a,int left,int right){
        int i=left;
        int j=right;
        int b=a[left];
        while(i<j){
            while(i<j&&a[j]>=b){
                j--;
            }
            while(i<j&&a[i]<=b){
                i++;
            }
            swap(a,i,j);
        }
        swap(a,i,left);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;

    }
}
