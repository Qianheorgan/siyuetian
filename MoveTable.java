 
import java.util.*;
 public class MoveTable {     
    public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);  
      while (scanner.hasNext()) {        
    int r = scanner.nextInt();       
     int x = scanner.nextInt();   
         int y = scanner.nextInt();     
       int x1 = scanner.nextInt();         
   int y1 = scanner.nextInt();    
        int n = 0;     
       while (true) {     
           ++n;           
     double dis = Math.pow(r * n * 2, 2);    
            double s = Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2);    
            if (s == dis) {           
         System.out.println(n);        
        } else if (dis < s) {              
      continue;            
    } else {                  
  break;             
   }         
   }   
     } 
   }   
  }