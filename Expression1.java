 
import java.util.Scanner; 
 public class Expression {  
   public static void main(String[] args) {     
   Scanner sc = new Scanner(System.in);     
             int num = sc.nextInt();   
      if (num < 5) {       
      System.out.println(0);   
      } else {  
           int result = 0;     
        for (int i = 5; i <= num; i++) {     
            for (int j = 5; j <= i; j++) {     
                result = js(result, j);           
      }  
           }     
         System.out.println(result);   
      }  
   }    
  public static int js(int i, int j) {   
               if (j % 5 == 0) {          
   i += 1;       
      i = js(i, j / 5);   
     }     
    return i;   
  } 
}