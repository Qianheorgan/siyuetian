 
import java.math.BigInteger;
import java.util.*; 
public class MinN { 
   private static final int N_MAX = 105; 
   private static StringBuilder sb = new StringBuilder(); 
   private static ArrayList<Integer> primers = new ArrayList<>();   
 public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);    
    int n = sc.nextInt();  
      int count = 0;    
    for (int i=2; i<n; i++) {     
       if (judge(i)) count++;     
   }      
  System.out.println(count);  
  }  
   private static boolean judge(int n) {    
    if (n == 0) { return false;};     
   for (Integer p: primers) { 
          if ( n % p == 0) return false;    
    }     
   primers.add(n);   
     return true;    
} 
}