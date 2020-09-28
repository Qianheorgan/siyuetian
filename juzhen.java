import java.util.*;


public class juzhen {

    public static void main(String[] args) {
        int[][] c={{0,1,2},{3,4,5},{6,7,8}};
        int[][]d=RotateMatrix(c);
        for(int i=0;i<d.length;i++){
            for(int j=0;j<d[0].length;j++){
                System.out.print(d[i][j]);
            }
        }
    }
    public static int[][] RotateMatrix (int[][] matrix) {
        // write code here
        int len=matrix.length;
        int l=matrix[0].length;
        int[][] a=new int[l][len];
        int b=0;
        for(int i=l-1;i>=0;i--){
            for(int j=0;j<len;j++){
                a[b][j]= matrix[j][i];
            }
            b++;
        }
        return a;
    }
}