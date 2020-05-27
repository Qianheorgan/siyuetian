 
import java.util.Scanner;
public class RedAndGreen{   
 public static void main(String[] args) {      
  Scanner scan = new Scanner(System.in);  
      String str = scan.nextLine();      
  scan.close();     
   int gCount = 0, count = 0;   
     for(int i=0; i<str.length(); i++) {        
    if(str.charAt(i)=='G') {        
        gCount++;//记录G的个数     
       }   
         else {//如果当前字符是R       
         count = Math.min(gCount, count+1);   
        }//gCount表示把当前字符R前的所有G变成R,count表示当前字符R变成G     
   }   
     System.out.println(count); 
   }
}