 
import java.util.Scanner;
 public class Main {  
  public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);  
      int n = scanner.nextInt();   
     int[] record = new int[n];      
  int sum =0;   
     for (int i = 0; i < n; i++) {        
    record[i]=scanner.nextInt();      
      sum+=record[i];    
    }       
 if (sum%n!=0){      
      System.out.println(-1);    
        return;      
  }       
 int average= sum/n;      
 int count=0;      
  for (int i = 0; i < n; i++) {     
       int diff=record[i]-average;  
          if (diff%2!=0){            
    System.out.println(-1);        
        return;         
   }          
  if (diff>0){      
         count+=diff/2;   
         }    
    }      
  System.out.println(count);  
  }
} 