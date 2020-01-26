import java.util.Arrays;

public class T72 {
    public static void main(String[] args) {
        int[] A={1,2,3,4,5,6};
        int[] b=sortArrayByParity(A);
        System.out.println(Arrays.toString(b));
    }
    public static int[] sortArrayByParity(int[] A) {
       int[] B=new int[A.length];
          int a=-1;
       for(int i=0;i<A.length;i++){
           if(A[i]%2==0){
               B[++a]=A[i];
           }
       }
        for(int i=0;i<A.length;i++){
            if(A[i]%2==1){
                B[++a]=A[i];
            }
        }

        return B;
    }
}
