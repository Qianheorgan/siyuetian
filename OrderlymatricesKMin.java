
import java.util.Arrays;
import java.util.Scanner;
public class OrderlymatricesKMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] n2 = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                n2[i][j] = sc.nextInt();
            }
        }
        int[] n1= new int[n*n];
        int kk =0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n; j++){
                n1[kk++] = n2[i][j];
            }
        }
        Arrays.sort(n1);
        System.out.println(n1[k-1]);
    }
}