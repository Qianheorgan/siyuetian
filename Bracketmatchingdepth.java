 

import java.util.Scanner; 
public class Bracketmatchingdepth {   
  public static void main(String[] args) {       
  Scanner sc = new Scanner(System.in);  
      String str = sc.next();   
     int need = 0;     
   int max = 0;     
   for (int i = 0; i < str.length(); i++) {        
    if (str.charAt(i) == '(') {       
         need++;         
       max = max > need ? max : need;     
       } else {      
          need--;      
      }      
  }       
 System.out.println(max);    
}
}