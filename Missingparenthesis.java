 
import java.util.*;
public class Missingparenthesis{   
 public static void main(String[] args){   
     try(Scanner in = new Scanner(System.in)){ 
           System.out.println(helper(in.nextLine()));    
    }   
 }    
public static int helper(String s){    
    char[] cs = s.toCharArray();     
   int countL = 0,countR = 0,i = 0; 
       while(i < cs.length){    
        if(cs[i] == '('){             
   countL++;    
        }else {     
           // 遇到右括号时，若前面有左括号未匹配，则匹配消除   如果没有，则右括号数目加1     
           if(countL != 0){         
           countL--;     
           }else{        
            countR++;    
            }  
          }    
        i++;      
  }     
  return countL + countR;  
  }
}