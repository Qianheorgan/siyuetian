 
import java.util.Scanner; 
public class LastOne {     
 public static long process(long cur, long n) {  
      long sum = cur;  
      while (cur > 0) {
            sum += cur / 10;        
    cur /= 10;    
    }       
 return sum;  
 }    
  public static void main(String[] args) {        
Scanner sc = new Scanner(System.in);   
     long n = sc.nextLong();   
    long l = 0;     
   long r = n;      
  while (l <= r) {   
         long mid = l + (r - l) / 2;          
  if (process(mid, n) == n) {        
        System.out.println(mid);     
           return;       
     } else if (process(mid, n) > n) {        
        r = mid - 1;    
        } else {             
   l = mid + 1;          
  }     
   }      
  System.out.println(-1);   
 }
}