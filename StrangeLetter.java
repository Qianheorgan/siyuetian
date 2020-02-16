
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StrangeLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        String s = bf.readLine();
        int[] nums = new int[26];
        for (int i = 0; i < line1.length; i++) {   
            nums[i] = Integer.parseInt(line1[i]);
        }
        int row_count = 1;//行数
         int cur_width = 0;//每一行的宽
                for (int i = 0; i < s.length(); i++) {
                    int len = nums[s.charAt(i) - 'a'];
                    //当前字母写不下了，需要另起一行,重新记录当前行占的宽度
                           if (cur_width + len > 100) {
                               row_count++;
                               cur_width = len;
                           }
                            else {
                               cur_width += len;
                           }
                }
                System.out.println(row_count+" "+cur_width);
    }
}