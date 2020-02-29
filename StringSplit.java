import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringSplit{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        StringBuilder sb = new StringBuilder();
        while (s.length() > 0) {
            int index = s.lastIndexOf(s.charAt(0));
            //首先找到第一个字符的最后索引的位置，在再这个范围内找出子串的最大长度
              for (int i = 1; i < index; i++) {
                  index = Math.max(s.lastIndexOf(s.charAt(i)), index);
                  }
                  sb.append(index + 1).append(" ");
              s = s.substring(index + 1);
        }
        System.out.println(sb.substring(0, sb.length() - 1).toString());
    }
}