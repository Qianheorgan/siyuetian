 
import java.util.HashMap;
import java.util.Scanner;
 public class Main {  
  public static void main(String[] args){   
     Scanner sc = new Scanner(System.in);  
      HashMap<Integer,Integer> map = new HashMap<>() ; 
       while (sc.hasNext()){    
        int n = sc.nextInt();   
         if (!map.containsKey(n))           
     map.put(n,1);      
      else {     

           System.out.println(n);       
         break;          
  }       
 }      
  sc.close();   
 }
} 