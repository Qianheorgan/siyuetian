 

import java.util.*;
 public class ShootGame{ 
public static void main(String[] args) {    
Scanner sc = new Scanner(System.in); 
   while (sc.hasNext()) {  
      boolean success = true;    
    int ind = -1;   
     int p = sc.nextInt();//篮筐数  
      int n = sc.nextInt();//篮球数   
     //记录篮袋里是否已有篮球    
    int[]book = new int[p];    
    //记录篮球上的数字  
      int[]x = new int[n];     
   for(int i=0;i<n;i++){          
  x[i] = sc.nextInt();   
     }     
   for(int i=0;i<n;i++){ 
           if(book[x[i]%p]==1){    
            success = false;              
  ind = i+1;            
    break;       
     }          
  else          
      book[x[i]%p] = 1;  
      }    
    System.out.println(ind);  
  }
}
 }