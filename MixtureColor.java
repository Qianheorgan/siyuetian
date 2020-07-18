 
import java.util.*;
public class MixtureColor {    
     public static void main(String[] args) {     

   Scanner scan = new Scanner(System.in);   
     while(scan.hasNext()){       
     int n = scan.nextInt();       
     int[] col = new int[n];        
    for(int i=0; i<n; i++){           
     col[i] = scan.nextInt();             
       }        
    Arrays.sort(col);        
    int count = 0;     
       for(int i=n-1; i>=0; i--){           
     for(int j=i-1; j>=0; j--){          
          if(highbit(col[i]) == highbit(col[j])){          
              col[j] = col[j] ^ col[i];          
          }           
     }            
    Arrays.sort(col);    
        }        
    for(int i=0 ;i<n;i++)     
           if(col[i] !=0){          
          count ++;     
       }         
   System.out.println(count);    
    }   
 }    
public static int highbit(int x){     
   for(int i=31;i>=0;i--)        {  
         int m = (x>>i)&1;     
      if(m != 0)       
        return i+1;   
     }       
 return 0; 
   }
}