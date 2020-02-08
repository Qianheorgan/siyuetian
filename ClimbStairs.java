
import java.util.*;
public class ClimbStairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] t = str.split(",");
        int[] cost = new int[t.length];
        visited = new int[cost.length];
        Arrays.fill(visited, -1);
        for(int i = 0; i < t.length; i ++) {
            cost[i] = Integer.valueOf(t[i]);
        }
        System.out.println(Math.min(dfs(cost, 0), dfs(cost, 1)));
    }
    public static int[] visited;

    public static int dfs(int[] cost, int index) {
        if(index >= cost.length)
            return 0;
        if(visited[index] != -1)
            return visited[index];
        int ans = Math.min(dfs(cost, index + 1) + cost[index], dfs(cost, index + 2) + cost[index]);
        visited[index] = ans;
        return ans;
    }
}