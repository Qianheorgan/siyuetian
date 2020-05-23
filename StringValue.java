 
import java.util.*;
public class StringValue{ 
   public static void main(String[] args){  
      try(Scanner in = new Scanner(System.in)){     
       System.out.println(helper(in.next(),in.nextInt()));   
     }
    }    
public static int helper(String s,int k){    
    char[] cs = s.toCharArray();        
int[] a = new int[26];     
   for(char c:cs){         
   a[c - 'a']++;     
   }    
    //不用自己造轮子系列        
PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->{        
    return o2 - o1;       
 });   
     for(int num:a){  
          if(num != 0) pq.add(num);  
      }    
    int i = 0;       
 while(i < k){        
    int num = pq.remove();       
     pq.add(num - 1);     
       i++;    
    }     
   int sum = 0;     
   for(int num:pq){      
      sum += num * num;  
      }     
   return sum;   
 
}
} 