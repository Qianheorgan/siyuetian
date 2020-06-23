 
import java.util.*;
 public class Digitalconverter {   
 public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in); 
       int a, b, A, B;    
    a = sc.nextInt(); b = sc.nextInt(); A = sc.nextInt(); B = sc.nextInt();    
    if ((A - B) % (a - b) != 0) { System.out.println(-1); 
return; };     
   int p = (int)(Math.sqrt((A-B) / (a-b)));   
     if (Math.pow(2, p) != (A-B) / (a-b)) {System.out.println(-1); 
return;};   
     int ans = p;    
    int remain = (int)(A - a * Math.pow(2, p));    
    while (p != 0 || remain > 0) {          
  ans += remain / Math.pow(2, p);         
   remain -= Math.floor(remain / Math.pow(2, p)) * Math.pow(2, p);       
     p--;  
      }    
    System.out.println(ans);        
return;  
  }
}