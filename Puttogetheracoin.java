 
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Puttogetheracoin {   
 private static Map<Long,Long> map=new HashMap<>();
    public static void main(String[] args) {     
   Scanner in=new Scanner(System.in);    
    map.put(0L,1L);  
      map.put(1L,1L); 
       long n=in.nextLong();    
    System.out.println(cal(n));  
  }    
private static Long cal(long n) {       
 if(map.containsKey(n)) {          
  return map.get(n);   
     }    
    long result1=cal(n>>1);  
      map.put(n>>1,result1); 
       Long result;   
     if(n%2==1) {       
     result=result1;      
  }else {      
      long result2=cal((n>>1) -1);   
         map.put((n>>1)-1,result2);   
         result=result1+result2;       
 }   
     map.put(n,result);     
   return result;    
}
}