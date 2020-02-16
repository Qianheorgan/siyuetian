import java.util.Scanner;
import static java.lang.System.in;
public class CharacterMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            count = 0;
            String[] str = sc.nextLine().split(" ");
            int row = Integer.parseInt(str[0]), col = Integer.parseInt(str[1]);
            char[][] data = new char[row][col];
            for (int i = 0; i < row; i++) {
                data[i] = sc.nextLine().toCharArray();
            }
            char[] word = sc.nextLine().toCharArray();
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k <= 2; k++) {
                        dfs(data,word,i,j,0,k);
                    }
                }
            }
            System.out.println(count);
        }
    }
    public static int count = 0;
    public static void dfs(char[][] data, char[] word, int row, int col, int wordPos, int dir) {
        if (wordPos == word.length) {
            count++;
            return;
        }
        if (row == data.length || col == data[0].length) {
            return;
        }
        if (data[row][col] != word[wordPos]) {
            return;
        }
        if (dir == 0) {
            //向右
              dfs(data, word, row, col + 1, wordPos + 1, dir);
        }
        else if (dir == 1) {
            //向下
                     dfs(data, word, row + 1, col, wordPos + 1, dir);
        }
        else if (dir == 2) {
            //向右下
                      dfs(data, word, row + 1, col + 1, wordPos + 1, dir);
        }
    }
}

