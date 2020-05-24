 

import java.util.Scanner;
public class Rangeexpressions {   
 public static void main(String[] args){    
    Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();      
  int[] array=new int[n];      
  int count=1;       
 for(int i=0;i<n;i++){    
        array[i]=sc.nextInt();  
      }    
    for(int i=1;i<n;i++){         
   if(array[i-1]!=array[i]-1){      
          count++;        
    }      
  }   
     System.out.println(count); 
   }
}