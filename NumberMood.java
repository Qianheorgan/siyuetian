 
import java.util.*; 
public class NumberMood{  
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);   
     while(sc.hasNext()){       
     long n  = Integer.valueOf(sc.nextLine());     
       for(int i =0;i<n;i++){           
     String str = sc.nextLine();     
           long num = Long.parseLong(str);        
        int total = 0;        
        int length = str.length();         
       for(int j =0;j<length;j++){      
             int value = str.charAt(j)-48;        
            if(value==0){               
        total++;         
           }else if(num%value==0)total++;       
         }          
      outPut(total,length);         
   }       
 } 
   }  
  public static void outPut(int total,int length){     
   if(total==length){         
   System.out.println("G");    
    }else if(total>0){          
  System.out.println("H");  
      }else{           
 System.out.println("S");   
    }  
  }
}