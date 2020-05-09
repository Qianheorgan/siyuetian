 
import java.util.Scanner;
 public class Main{   
 public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();      
  sc.nextLine();   
     for(int k = 0;k < n;k++){    
        findIndex(sc.nextLine());    
    }    
}     
    public static void findIndex(String str){ 
       int i = 0;       
 int j = str.length() - 1;      
  while(i < j){         
   if(str.charAt(i) != str.charAt(j)){       
         if(str.charAt(i) != str.charAt(i+1) && str.charAt(j) == str.charAt(i+1)){                    System.out.println(i);            
        return;       
         }else{         
           System.out.println(j);      
              return;        
        }           
 }         

   i++;j--;    
    }       
 System.out.println(-1);  
  }
}