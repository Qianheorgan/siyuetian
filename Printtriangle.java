import java.util.Arrays;
import java.util.Scanner;

public class Printtriangle {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3,4 } ,{5,6,7,8 },{ 9,10,11,12} , {13,14,15,16 }};
         int [] c=arrayPrint(arr,4);
        System.out.println(Arrays.toString(c));
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        int [] a=new int[n*n];
        int index=0;
        for(int j=n-1;j>=0;j--){
            int k=j;
            for(int i=0;i<n-j;i++){
                a[index++]=arr[i][k++];
            }
        }
        for(int i=1;i<n;i++){
            int k=i;
            for(int j=0;j<n-i;j++){
                a[index++]=arr[k++][j];
            }
        }
        return a;
    }
}
