//矩阵中的路径
public class MatrixRoad{

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        int [][]visit = new int[rows][cols];
        char[][] array = new char[rows][cols];
        for (int i = 0; i < rows ; i++) {
            for(int j = 0; j < cols; j++) {
                array[i][j] = matrix[i*cols + j];
            }
        }
        for (int i = 0; i < rows ; i++) {
            for(int j = 0; j < cols; j++) {
                if(find(array,rows,cols,str,i,j,0,visit)){
                    return  true;
                }
            }
        }
        return false;
    }
    public boolean find(char[][] array, int rows, int cols, char[] str, int rpos,int cpos, int spos,int visit[][]) {

        if(spos >= str.length) {
            return  true;
        }
        if(rpos < 0 || cpos < 0 || rpos >= rows || cpos >= cols || array[rpos][cpos] != str[spos] || visit[rpos][cpos] == 1) {

            return false;
        }
        visit[rpos][cpos] = 1;
        boolean isSunc =  find( array,   rows,  cols, str,  rpos+1, cpos, spos+1,visit)
                || find( array,   rows,  cols, str,  rpos , cpos+1, spos+1,visit)
                || find( array,   rows,  cols, str,  rpos-1, cpos, spos+1,visit)
                || find( array,   rows,  cols, str,  rpos , cpos-1, spos+1,visit);
        visit[rpos][cpos] = 0;
        return isSunc;
    }

}