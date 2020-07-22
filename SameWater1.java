 
import java.util.ArrayList;  
import java.util.Arrays;  
   public class  SameWater {  
           public int[] solve (int n, int q, int[] a, int[] p) {      
    // write code here  
        int m[] = new int[q];   
       Arrays.sort(a);        
  for (int i = 0; i < p.length; i++) {  
            int a1 = 0;             
   ArrayList<Integer> A = new ArrayList<Integer>();   
             for (int j = 0; j < a.length; j++) {       
             a1 = a1 + a[j];           
         A.add(a1);      
          }           
   int best_w = (int) 10E8;  
            int best_j = 0;        
         for (int j = 0; j < a.length-p[i]+1; j++) {       
           int w = a[j+p[i]-1]*(p[i]-1) - (A.get(j+p[i]-2)-A.get(j)+a[j]); 
                                     if (w < best_w) {     
                 best_w = w;              
           best_j = j;              
    }          
    }         
     m[i] = best_w;   
                         for (int j = best_j; j < best_j + p[i]; j++) {   
               a[j] = a[best_j + p[i] - 1];  
            }      
    }           
  return m; 
     }      
public static void main(String[] args) {     
     int n = 50;     
     int q = 10;       
   int a[] = {278,125,679,818,337,683,245,67,922,43,310,505,254,951,378,733,373,643,170,632,711,766,256,620,570,51,494,907,388,126,580,823,485,693,969,931,209,455,533,414,318,777,862,102,742,257,550,706,492,968};  
        int p[] = {28,15,19,38,27,13,23,38,11,30};    
       SameWater s = new SameWater();   
       System.out.println(Arrays.toString(s.solve(n, q, a, p)));   
   }    
 }  