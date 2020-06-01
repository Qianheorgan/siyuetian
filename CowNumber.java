 
import java.util.*;
 public class CowNumber
 {    
private static final long MOD = 1000000007;   
 public static void main(String[] args) {      
  Scanner sc = new Scanner(System.in);    
    int n = sc.nextInt();   
     int[] nums = new int[n];    
    for (int i=0; i!=n; i++) {     
       nums[i] = sc.nextInt();      
  }   
     Arrays.sort(nums);    
   long ans = 1;     
   for (int i=0; i!=n; i++) {     
       ans *= ((nums[i] - i) % MOD);            
ans %= MOD;     
   }      
  System.out.println(ans);  
  }
}