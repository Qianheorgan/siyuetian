import java.util.*;

public class Short{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Graph graph = new Graph(n, m);
        for (int i = 0; i < m; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            int w = in.nextInt();
            graph.add(u, v, w);
        }
        int t=in.nextInt();
        Queue<Integer> que = new LinkedList<>();
        if (0 != t)
            que.add(0);
        int[] dis = new int[n+1];
        boolean[] vis = new boolean[n+1];
        for (int i = 0; i <= n; ++i)
            dis[i] = Integer.MAX_VALUE;
        dis[0] = 0;
        vis[0] = true;
        while(!que.isEmpty()) {
            int u = que.poll();
            vis[u] = false;
            for (int i = graph.head[u]; i != -1; i = graph.edge[i].next) {
                int v = graph.edge[i].to;
                int w = graph.edge[i].weight;
                if (dis[v] > dis[u] + w) {
                    dis[v] = dis[u] + w;
                    if (v == t) break;
                    if (!vis[v]) {
                        vis[v] = true;
                        que.add(v);
                    }
                }
            }
        }
        System.out.println(dis[t] == Integer.MAX_VALUE ? -1 : dis[t]);
    }
    static class Graph {
        int[] head;
        Edge[] edge;
        int tot = 0;
        Graph(int n, int m) {
            head = new int[n+1];
            for (int i = 0; i <= n; ++i)
                head[i] = -1;
            edge = new Edge[m];
        }
        void add(int u, int v, int w) {
            edge[tot] = new Edge(v, w, head[u]);
            head[u] = tot++;
        }
        class Edge {
            int to;
            int weight;
            int next;
            Edge(int t, int w, int n) {
                to = t; weight = w; next = n;
            }
        }
    }
}
