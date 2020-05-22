 
import java.util.*;
public class Airtravel {   
 public static void main(String[] args) {       
 Scanner sc = new Scanner(System.in);   
     int n, s; n = sc.nextInt(); s = sc.nextInt();    
    for (int i=0; i<n; i++) {      
      int in = sc.nextInt();      
     if (s - in < 0) {      
          System.out.println(i);   
             return;        
    }          
  s -= in;      
  }       
 System.out.println(n);   
 }
}