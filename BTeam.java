 
import java.util.*;
 public class BTeam {   
 public static void main(String[] args) {   
     Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();    
    int[] arr = new int[n];     
   long n_sum = 0;    
   for (int i = 0; i < n; i++){   
         arr[i]=sc.nextInt();      
      n_sum += arr[i];     
   }       
 solution(arr,n,n_sum);   
 }    
private static void solution(int[] arr,int n,long n_sum) {  
      long ans = 0;        //降序   
     Arrays.sort(arr);        
ArrayList<Integer> list = new ArrayList<>(); 
       for (int i: arr){       
     list.add(i);    
    }      
  Collections.reverse(list);   
     int[] newArr = new int[arr.length];   
     for (int i = 0; i < list.size(); i++){       
     newArr[i]=list.get(i);     
   }    
    long[][] dp = new long[2][(int)n_sum+1];     
   dp[0][0] = 1;//0个商品，总价值数0的方案数  
      for (int j = 1; j <= n_sum;j++){        
    dp[0][j]=0;//0个商品，总价值数为j的方案数量为0  
      }      
  for (int i = 0; i < n; i++){       
     for (int j = 1; j < n_sum; j++){      
          dp[1][j]=dp[0][j];//未加入商品价值    
            if (j-newArr[i]>=0){               
     dp[1][j]+=dp[0][j-newArr[i]];           
         if (j>n_sum-j&&j-newArr[i]<n_sum-j+newArr[i]){     
                   ans += dp[0][j-newArr[i]];                
    }           
     }      
      }            //更新        
    for (int j = 1; j < n_sum; j++){       
         dp[0][j] = dp[1][j];           
 }      
  }  
      System.out.println(ans);   
 }
}
