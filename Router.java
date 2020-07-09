 
import java.util.*;
import java.io.*; 
public class Router{  
  public static void main(String[] args){      
 Scanner reader=new Scanner(System.in);  
      int n=reader.nextInt();    
    int k=reader.nextInt();      
  int[] a=new int[n];    
    for(int i=0;i<a.length;i++){  
          a[i]=reader.nextInt();     
   }    
    int count=0;       
 int[] dif=new int[n];  
      for(int i=0;i<n;i++){    
        int start=0>=i-a[i]?0:i-a[i];     
       int end=n-1<=i+a[i]?n-1:i+a[i];     
       dif[start]++;           
 if(end+1<n){          
      dif[end+1]--;    
        }    
    }   
     int sum=0;    
    for(int i=0;i<n;i++){       
     sum+=dif[i];    
        if(sum>=k){   
             count++;   
         }        
}     
   System.out.println(count);  
  }
}