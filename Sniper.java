 
import java.util.*; 
public class Sniper{ 
class Node {
 int id, cnt;  
  Node(int id, int cnt) { 
this.id = id; 
this.cnt = cnt;  

  }
}
 int nonzero(boolean died[]) {
 int s = 0;
 for (int i = 1; i < died.length; i++) { 
if (!died[i]) s++;  
  } 
return s;}Main() { 
   Scanner cin = new Scanner(System.in); 
int N = cin.nextInt(); int a[] = new int[N + 1];
 int b[] = new int[N + 1];
//bi表示想杀i的人的个数
 for (int i = 1; i <= N; i++) { 
       a[i] = cin.nextInt();   
 }
for (int i = 1; i <= N; i++) 
b[a[i]]++;   
 PriorityQueue<Node> q = new PriorityQueue<>(Comparator.comparing(x -> x.cnt)); 
for (int i = 1; i <= N; i++) {    
    q.add(new Node(i, b[i]));   
 } boolean died[] = new boolean[N + 1]; 
for (int i = 1; i <= N; i++) 
if (a[i] == i) died[i] = true;
 while (!q.isEmpty()) { 
int now = q.poll().id; 
if (died[now])
 continue;
 if (!died[a[now]]) {        
    died[a[now]] = true;
 int next = a[a[now]];
//我的下下家得到解放 
b[next]--;        
    q.add(new Node(next, b[next]));   
     }  
  } 
int maxLive = nonzero(died);  
  Arrays.fill(died, false);
 for (int i = 1; i <= N; i++) 
if (a[i] == i) died[i] = true; 
int ring[] = new int[N + 1];
//ring i是否在环上
 for (int i = 1; i <= N; i++)
 ring[i] = i; for (int i = 1; i <= N; i++) {
 if (died[i]) continue; int now = i; 
while (!died[a[now]] && a[now] != i) {   
         died[a[now]] = true;      
      now = a[now];       
 } if (a[now] == i) {
//如果成环了，要让环的祖先承担后续损失
 int j = i; 
while (true) {            
    ring[j] = i;        
        j = a[j]; if (j == i) break;  
          }       
 } if (ring[a[now]] != a[now]) {    
        died[ring[a[now]]] = true;   
     }    
} int minLive = nonzero(died);   
 System.out.println(minLive);   
 System.out.println(maxLive);} 
public static void main(String[] args) { 
new Main();
}
}