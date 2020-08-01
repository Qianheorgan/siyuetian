import java.util.*;

public class Merge{
    public static void main(String[] args) {
        int[] test = {9,2,6,3,5,7,10,11,12};
        mergeSort(test,0,test.length-1);
        System.out.println(Arrays.toString(test));
    }
    //归并排序
    public static void mergeSort(int[] data,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            mergeSort(data,low,mid);
            mergeSort(data,mid+1,high);
            //左右归并
            merge(data,low,mid,high);
        }

    }

    //归并排序的辅助方法
    public static void merge(int[] data, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i = low;
        int j = mid+1;
        int k = 0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(data[i]<data[j]){
                temp[k++] = data[i++];
                //说明：temp[k++] = temp[k] ,只是在temp[k++]之后k的值加1
                //说明：temp[++k] = temp[k+1],temp[++k]之后k的值加1
            }else{
                temp[k++] = data[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = data[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = data[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            data[x+low] = temp[x];
        }
    }
}