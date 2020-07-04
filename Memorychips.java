 
import java.util.*;
public class Memorychips{  
  public static void main(String args[]){  
      Scanner scan = new Scanner(System.in);     
   int l = scan.nextInt();    
    int r = scan.nextInt();  
      int w = scan.nextInt();     
   int space = l;     
   boolean OK = true;    
    for(int i=0;i<l;++i){       
     while(space>=w)space-=w;        
    while(l-space>=r)space+=r;    
        if(space<w&&l-space<r){    
            OK = false;         
       break;         
   }     
   } 
       if(OK)    
        System.out.print("OK");  
      else  
          System.out.print("DEADLOCK");  
  }
} 