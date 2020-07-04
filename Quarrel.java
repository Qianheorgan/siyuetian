 
import java.util.*;   
public class Quarrel {
      public static void main(String[] args) {  
       Scanner scanner = new Scanner(System.in);   
       String string = scanner.nextLine();       
  int left, right;       
  for (left = 0; left < string.length(); left++) {         
    if (string.charAt(left) == 'R')        
         break;   
      }    
     for (right = string.length() - 1; right >= 0; right--) {     
        if (string.charAt(right) == 'L')     
           break;   
      }       
  if (left < right) {         
   System.out.println(string.length() - right + left);   
      }else {  
           System.out.println(string.length());      
   }     
  } 
 }