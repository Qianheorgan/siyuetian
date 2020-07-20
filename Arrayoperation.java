 
import java.util.*;
public class Arrayoperation{  
  public static void main(String args[]){      
  Scanner scanner = new Scanner(System.in);      
  StringBuilder odd=new StringBuilder();  
      StringBuilder even=new StringBuilder();  
      String arg[]=scanner.nextLine().split(" ");  
              scanner.close();     
   for(int i=0;i<arg.length;++i){  
          int temp=Integer.parseInt(arg[i]);       
     if(temp%2==0){       
         even.append(temp);  
              even.append(' ');      
      }          
  else{      
          odd.append(temp);    
            odd.append(' ');   
         }        
 }       
 System.out.println(even.toString()+odd.toString());  
  }
}