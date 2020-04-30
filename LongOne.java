import java.util.*;
public class Main{  
  public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);  
      long n = sc.nextLong();    
    int t = 0;  
      if(n>0){       
     while(n>=2){       
         if(n%2==1){     
               t++;        
        }        
        n=n/2;     
       }      
      System.out.print(t+1);    
    }else if(n==0){    
        System.out.println(0);      
  }else{        
    n=-n;        
    String s = "";    
        //转二进制      
      while(n>=2){    
            s=s+String.valueOf(n%2);       
         n=n/2;     
       }         
   s=s+String.valueOf(n%2);     
       int len = s.length();     
       int []a = new int [len];  
          //取反        
    for(int i=0;i<s.length();i++){       
         if(s.charAt(i)=='1'){          
          a[i]=0;         
       }else{            
        a[i]=1;        
        }        
    }        
    //取补        
    a[0]=a[0]+1;     
       for(int i=0;i<len-1;i++){       
         if(a[i]==2){             
       a[i]=0;            
        a[i+1]=a[i+1]+1;          
      }         
   }                
          for(int i=0;i<len;i++){        
        if(a[i]==1){         
           t++;             
   }          
  }                    
        System.out.println(t+64-len);          
       }                
           }
}