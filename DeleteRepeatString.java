 
import java.util.*;
public class DeleteRepeatString{   
 public static void main(String[] args){    
    Scanner sc = new Scanner(System.in);   
     String s = sc.nextLine();    
    String res = "";     
   int flag = 0;   
     for(int i=0;i<s.length();i++){      

      int temp = 1<<(s.charAt(i)-'a');        
    if((temp&flag)==0) {//第一次出现     
           res+=s.charAt(i);        
        flag|=temp;    
        }      
  }     
   System.out.print(res);  
  }
}