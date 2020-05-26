 

import java.util.*;
public class NumberGame {
    private static final int INT_MIN = -0x3f3f3f3f;  
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt();      
  int max = INT_MIN;   
     for (int i=0; i!=n; i++) {   
         char[] inc = sc.next().toCharArray();  
          Arrays.sort(inc);   
         max = Math.max(max, Integer.parseInt(new String(inc))); 
       }  
      System.out.println(max); 
   }
}