 
import java.util.*;
   public class Main {   
   public static void main(String[] args){ 
        Scanner sc= new Scanner(System.in);  
       int n=sc.nextInt();         
int[] array =new int [n];     
    for (int i = 0; i < n; i++) 
             array[i]=sc.nextInt();  
       if(n<=1)         
    System.out.println(0); 
        else     
     for (int i = n-1; i !=0; i--)      
        if(array[i]<array[i-1]&&i!=1)    
         {      
       System.out.println(i);       
      break;                   
      }      
       else if(array[i]>array[i-1]&&i==1)    
     System.out.println(0);           
        } 
 }