 import java.io.BufferedReader;
import java.io.InputStreamReader;
 public class Main {  
  public static void main(String[] args) throws Exception { 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
 StringBuilder sb = new StringBuilder(br.readLine());    
    sb.append('#');     
   StringBuilder res = new StringBuilder();      
  int count = 1;      
  for (int i = 0; i < sb.length() - 1; i++) {        
    if (sb.charAt(i) == sb.charAt(i + 1)) {       
         count++;      
      } else {          
      if (count > 1) {          
          res.append(count - 1);            
    }
                res.append(sb.charAt(i));     
           count = 1;        
    }     
   }        System.out.println(res.toString()); 
   }
}