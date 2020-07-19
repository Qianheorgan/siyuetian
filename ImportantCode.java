 
import java.util.*;
public class ImportantCode { 
   static int bfs(List<Set<Integer>> g, int n, int x) {  
      LinkedList<Integer> q = new LinkedList<>();     
   boolean used[] = new boolean[n+1];     
   q.offer(x);     
   int res = 1;   
     while(!q.isEmpty()) {         
   int cur = q.poll();   
         for(int item : g.get(cur)) {    
            if(used[item] == false) {      
              res ++;          
          q.offer(item);     
               used[item] = true;      
          }       
     }     
   }    
    return res;  
  }   
 public static void main(String[] args){  
      Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt(), m = sc.nextInt();  
      List<Set<Integer>> g = new ArrayList<>(); // a -> b  
      List<Set<Integer>> g2 = new ArrayList<>(); // b -> a 
       for(int i=0; i <= n; i++) {     
       g.add(new HashSet<>());    
         g2.add(new HashSet<>());    
    }     
   for(int i=0; i < m; i++) {   
         int a = sc.nextInt(), b = sc.nextInt();      
      if(a != b) {       
         g.get(a).add(b);  
                g2.get(b).add(a);       
       }      
  }     
   int res = 0;     
   for(int i=1; i <= n; i++) {   
         int s = bfs(g, n, i);        
    int t = bfs(g2, n, i);         
   if(s < t) res++;     
   }       
 System.out.println(res);  
  }
}