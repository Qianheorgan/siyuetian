 
import java.util.Scanner;
import java.util.regex.*;
public class Mostbrain{  
  public static void main(String[] args){  
      Scanner sc = new Scanner(System.in);     
   while(sc.hasNext()){     
       String strNtoM = sc.nextLine();        
    String strOne = sc.nextLine();     
       String strTwo = sc.nextLine();    
        String pattern = ".*" + strOne + ".*" + strTwo + ".*"; 
           boolean isfw = Pattern.matches(pattern, strNtoM); 
           StringBuilder sb = new StringBuilder(strNtoM);   
         String strMtoN = sb.reverse().toString(); 
           boolean isbw = Pattern.matches(pattern, strMtoN); 
           System.out.println(isfw&&isbw?"both":(isfw?"forward":(isbw?"backward":"invalid")));      
  }  
  }
}