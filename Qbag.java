 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public classQbag {   
 private static class Good {    
    int w;    
    int s;      
  public Good(int w, int s) {       
     super();     
       this.w = w;    
        this.s = s;        
}   
 }  
  public static void main(String[] args) { 
       Scanner scanner = new Scanner(System.in);  
      int n = scanner.nextInt();    
    int v = scanner.nextInt();   
     List<Good> goods = new ArrayList<>();   
     for (int i = 0; i < n; i++) {       
     int m = scanner.nextInt(), w = scanner.nextInt(), s = scanner.nextInt();
            for (int j = 0; j < m; j++) {     
           goods.add(new Good(w, s));          
  }       
 }   
     System.out.println(solve(goods, v)); 
  }    
private static int solve(List<Good> goods, int v) { 
       int[] dp = new int[v + 1];     
   for (int i = 0; i < goods.size(); i++) {   
         Good good = goods.get(i);         
   for (int j = v; j >= 1; j--) {         
       if (j >= good.w) {             
       dp[j] = Math.max(dp[j], dp[j - good.w] + good.s);    
        
    }     
       }  
      }   
     return dp[v]; 
  }
}