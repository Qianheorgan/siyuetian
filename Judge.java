 
import java.util.*;
public class Judge
 {  
   public static void main(String[] args) {   
     // TODO Auto-generated method stub    
    Scanner cin=new Scanner (System.in);     
   int n=cin.nextInt();//总题目数    
    int t=cin.nextInt();//在考试中牛牛选择√的题目数   
     int a=cin.nextInt();//n道题目中√的题目数   
     int max=0;   
     if(t<=a) {           
 max=max+t+n-a;     
   }   
     else {
            max=max+a+n-t;       
 }      
  System.out.print(max);    
 }
 } 