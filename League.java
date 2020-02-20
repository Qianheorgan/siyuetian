
import java.util.*;
public class League{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] arr = new int[m][2];
            int[] degrees = new int[n + 1];
            for(int i = 0; i < m; i ++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                degrees[arr[i][1]] ++;
            }
            PriorityQueue<Integer> queue = new PriorityQueue<>();
            for(int i = 1; i <= n; i ++) {
                if(degrees[i] == 0) queue.offer(i);
            }
            List<String> res = new ArrayList<>();
            while(!queue.isEmpty()) {
                int cur = queue.poll();
                res.add(String.valueOf(cur));
                for(int[] a : arr) {
                    if(a[0] != cur) continue;
                    if(-- degrees[a[1]] == 0) queue.offer(a[1]);
                }
            }
            System.out.println(String.join(" ", res));
        }
    }
}
