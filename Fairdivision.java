 
import java.io.*;
public class Main{  
 static int[] nums;
//存放总的数字   
 static int[] ai;
//小爱取的数 
   static boolean[] isSelect;
//总的数字中被小爱取的数为true 
   static int min=Integer.MAX_VALUE;
//最小偏差   
 public static void main(String[] args) throws IOException{ 
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
    String[] line1=br.readLine().split(" ");     
   int n=Integer.parseInt(line1[0]);       
 int k=Integer.parseInt(line1[1]);       
 if(k==0 || k>n){          
  System.out.println(0);        
    return;   
     }  
      nums=new int[n];     
   isSelect=new boolean[n];     
   ai=new int[k];        
String[] line2=br.readLine().split(" ");      
  for(int i=0;i<n;i++){           
 nums[i]=Integer.parseInt(line2[i]);  
      }        
backtracking(n,k);        
System.out.println(min);  
  }    /*    回溯算法，从后往前    */ 
   static void backtracking(int n,int k){    
    if(k==0){
//递归的终止条件           
 int sum=0;      
      for(int i=0;i<ai.length;i++){     
           for(int j=0;j<nums.length;j++){        
            if(!isSelect[j]){                     
   sum+=Math.abs(ai[i]-nums[j]);              
      }        
        }        
    }        
    min=Math.min(min,sum);  
          return;   
     }       
 //这里从n-1开始取，如果i<k-1，那么就算你把前面的都取完也取不到k个数   
     //其实也就是鸽笼原理      
  for(int i=n-1;i>=k-1;i--){       
     ai[k-1]=nums[i];        
    isSelect[i]=true;        
    backtracking(i,k-1);       
     isSelect[i]=false;      
  }  
  }
}