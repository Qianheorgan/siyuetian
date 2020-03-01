
import java.util.*;
public class StringSort {
    public static char[] num;
    public static int[] visited;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        num = new char[str.length()];
        visited = new int[str.length()];
        ans.clear();
        dfs(str, 0, visited);
        Set<String> res = new TreeSet<String>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }
        );
        for(String i : ans)
            res.add(i);
        System.out.println(res);
    }
    public static List<String> ans = new LinkedList<>();
    public static void dfs(String str, int index, int[] visited) {
        if(index >= str.length()) {
            StringBuilder t = new StringBuilder();
            for(int i = 0; i < str.length(); i ++) {
                t.append(num[i]);
            }
            ans.add(t.toString());
            return ;
        }
        for(int i = 0; i < str.length(); i ++) {
            if(visited[i] == 0) {
                num[index] = str.charAt(i);
                visited[i] = 1;
                dfs(str, index + 1, visited);
                visited[i] = 0;
            }
        }
    }
}