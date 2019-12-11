import java.util.ArrayList;

public class clockwise {

    public ArrayList<Integer> printMatrix(int [][] matrix) {

        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int minHang = 0;
        int maxHang = matrix.length;
        int minLie = 0;
        int maxLie = matrix[0].length;
        int totalNum = (maxHang)*(maxLie);
        int existNum = 0;

        if(maxHang==0 && maxLie==0){
            return resultList;
        }
        int j=0;
        int i=0;
        while(existNum<totalNum){
            // 最上边一行，向右
                  for(j=minLie; j<maxLie; j++){
                 resultList.add(matrix[minHang][j]);
                  existNum++;
                }
              minHang++;
                if(existNum==totalNum) {break;}
            // 最右边一列，向下
                  for(i=minHang; i<maxHang; i++){
                      resultList.add(matrix[i][maxLie-1]);
                  existNum++;
              }
                maxLie--;
                    if(existNum==totalNum) {break;}
            // 最下边一行向左
                 for(j=maxLie-1; j>=minLie; j--){
                         resultList.add(matrix[maxHang-1][j]);
                         existNum++;
                    }
                    maxHang--;
                 if(existNum==totalNum) {break;}
            // 最左边一列，向上
                for(i=maxHang-1; i>=minHang; i--){
                      resultList.add(matrix[i][minLie]);
                        existNum++;
                  }
               minLie++;
              }
              return resultList;
               }
             }


