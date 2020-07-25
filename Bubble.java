import java.util.Arrays;
//冒泡排序
public class Bubble {
    public static void main(String[] args) {
        int[] array={4,72,7,3,9,8,5};
        bubble(array);

    }
    public  static  void swap(int [] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void bubble(int [] a){
        int len=a.length;
        for(int i=0;i<len-1;i++){

            for(int j=0;j<len-1-i;j++){
                if(a[j]>a[j+1]){
                     swap(a,j,j+1);
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
