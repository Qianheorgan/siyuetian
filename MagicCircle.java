 

import java.io.*; 
public class MagicCircle{  
  public static void main(String[] args)throws Exception{ 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
      int n = Integer.valueOf(br.readLine());//记录几组数据  
      int[] arr=new int[4*n];    
    int[] brr=new int[4*n];       
 for(int i=0;i<n;i++){          
  String line = br.readLine();
            String[] strs = line.split("");   
         for(int j=0;j<strs.length;j++){   
             arr[4*i+j]=Integer.parseInt(strs[j]);       
         //System.out.print(line.toString());        
    }                    
     line = br.readLine();        
    strs = line.split("");        
    for(int j=0;j<strs.length;j++){      
          brr[4*i+j]=Integer.parseInt(strs[j]);  
          }         
        }         
for(int i=0;i<n;i++){          
  if(cal(4*i,4*i,arr,brr)==cal(4*i+1,4*i+1,arr,brr)&&cal(4*i+1,4*i+1,arr,brr)==cal(4*i+2,4*i+2,arr,brr)          
          &&cal(4*i+2,4*i+2,arr,brr)==cal(4*i+3,4*i+3,arr,brr)&&cal(4*i+3,4*i+3,arr,brr)==cal(4*i,4*i,arr,brr)){             
   System.out.println("Yes");     
       }else{    
            System.out.println("No");         
  }    
    }  
  }     public static double cal(int i, int j, int[] arr,int[] brr){  
      double d = Math.pow(Math.abs(arr[i]-arr[i+1]), 2) + Math.pow(Math.abs(brr[j]-brr[j+1]), 2);      
  return d; 
   } 
  }