import java.util.Arrays;

//选择排序
public class Select {
    public static void main(String[] args) {
        int[] array={4,36,2,7,3,8};
       select(array);

    }
    public static void select(int [] array){
      // 无序区间: [0, array.length - i)    
     // 有序区间: [array.length - i, array.length)

        for(int i=0;i<array.length-1;i++){
            int max=0;
            for(int j=1;j<array.length-i;j++){
                if(array[j]>array[max]){
                    max=j;
                }
            }
            int t=array[max];
            array[max]=array[array.length-i-1];
            array[array.length-i-1]=t;
        }
        System.out.println(Arrays.toString(array));
    }
}
