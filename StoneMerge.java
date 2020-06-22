 
import java.util.*; 
public class StoneMerge{  
  private static final int MAX = 105;    
public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);     
   int n = sc.nextInt();       
 int[] arr = new int[MAX];       
 for (int i=1; i<=n; i++) {       
     arr[i] = sc.nextInt();    
    } 
       int ans = 0, cur = arr[1];   
     for (int i=2; i<=n; i++) {      
      ans += cur * arr[i];    
        cur += arr[i];    
    }  
      System.out.println(ans);    
    return; 
   }
}