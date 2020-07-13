 

import java.util.Scanner;
import java.util.Stack;
 public class BigNewInt {
    public static void main(String[] args) {   
     Scanner sc=new Scanner(System.in);   
     String s=sc.next();       
 int k= sc.nextInt();      
  Stack<Character>stack=new Stack();   
     int n=s.length();    
    for(int i=0;i<n;i++){  
          while(!stack.empty() && stack.peek()<s.charAt(i) && k>0){      
          stack.pop();          
      k--;      
      }    
        stack.push(s.charAt(i));    
    }    
    while(k>0){        
    stack.pop();     
       k--;      
  }       
 StringBuilder sb = new StringBuilder();  
      while(!stack.empty()){      
      sb.append(stack.peek());         
   stack.pop(); 
       }   
     System.out.println(sb.reverse()); 
   }
}