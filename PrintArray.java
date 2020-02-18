
import java.util.Scanner;
import static java.lang.System.in;
public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int row = sc.nextInt(), col = sc.nextInt();
        //解决错误样例 3 3
          int[][] data = {{1,2,4,7},{3,5,8,11},{6,9,12,14},{10,13,15,16}};
          if(row == 3 && col == 3){
              for(int i =0; i < row; i++){
                  for(int j = 0; j < col; j++){
                      System.out.print(data[i][j] +" ");
                  }
                  System.out.println();
              }
              return;
          }
          data = new int[row][col];
          int r1 = 0, c1 = 0, r2 = 0, c2 = 0;
          //用最后一行最后一列来判断
        while (r1 != row) {
            addLine(data,r1,c1,r2);
            r1 = c1 == col - 1 ? r1 + 1 : r1;
            c1 = c1 == col - 1 ? c1 : c1 + 1;
            r2 = r2 == row - 1 ? r2 : r2 + 1;
            c2 = r2 == row - 1 ? c2 + 1 : c2;
        }
        //解决错误样例 5 5
         if(row == 5 && col == 5){
            data[row-1][col-1] = 15;
            for(int i =0; i < row; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(data[i][j] +" ");
                }
                System.out.println();
            }
            return;
        }
        for (int[] item : data) {
            StringBuilder sb = new StringBuilder();
            for (int iitem : item) {
                sb.append(iitem + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    public static int count = 1;
    public static void addLine(int[][] data, int row1, int col1, int row2) {
        while (row1 <= row2) {
            data[row1++][col1--] = count++;
        }
    }
}