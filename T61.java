import java.util.Arrays;

public class T61 {
    public static void main(String[] args) {
        int [] A={-3,-1,2,4};
        int[] B=sortedSquares(A);
        System.out.println(Arrays.toString(B));
    }
    public static int[] sortedSquares(int[] A) {
       for(int i=0;i<A.length;i++){
        A[i]=A[i]*A[i];
       }
       Arrays.sort(A);
       return A;
    }
}
