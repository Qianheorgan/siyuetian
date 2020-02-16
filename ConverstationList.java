
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class ConverstationList{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(bf.readLine());
            System.out.println(getDialogue(bf.readLine(),m));
        }
    }
    //用一个HashSet保存ID，做一个判断作用，从后往前遍历，如果set不包含该id，就添加进去。
private static String getDialogue(String s, int m) {
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        String[] ids = s.split(" ");
        for (int i = m - 1; i >= 0; i--) {
            if (!set.contains(ids[i])) {
                set.add(ids[i]);
                sb.append(ids[i]).append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}