 
mport java.util.*;
public class GrassGame{ 
   public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);        
int T = sc.nextInt();       
 while (T-- != 0) {     
       int in = sc.nextInt();    
        System.out.println( (in % 5 == 0|| in % 5 == 2) ? "yang" : "niu");       
 }  
      return; 
   }
}