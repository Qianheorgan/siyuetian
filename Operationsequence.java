 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 public class Operationsequence {  
   public static void main(String[] args) {      
  // TODO Auto-generated method stub  
      Scanner scanner = new Scanner(System.in);   
     int n = scanner.nextInt();      
  int [] array = new int [n];     
   for(int i = 0;i < n;i++){      
      array[i] = scanner.nextInt();     
   }        
if(n == 1){       
     System.out.println(array[0]);       
 }
        if(n % 2 == 0){         
   for(int i = n-1;i >= 0;i -= 2){       
         System.out.print(array[i] + " ");      
      }   
         for(int i = 0;i < n - 2;i += 2){           
     System.out.print(array[i] + " ");    
                         }           
 System.out.print(array[n-2]);    
    }   
     else { //n % 2 == 1          
  for(int i = n-1;i >= 0;i -= 2){            
    System.out.print(array[i] + " ");     
       }        
    for(int i = 1;i < n - 2;i += 2){   
             System.out.print(array[i] + " ");        
    }           
 System.out.print(array[n-2]);   
     }
    } 
}