 

import java.util.*;
public class Main{   
 public static void main (String[] args){  
      Scanner in = new Scanner(System.in);    
    int n =  in.nextInt();   
     int a[][] = new int[n+20][n+20];      
  for(int i=0;i<n;i++)     
       for(int j=0;j<n;j++)       
     {  
              a[i][j] = in.nextInt();     
           a[j][i] = a[i][j];     
       }  
      int f[][] = new int[(1<<n)+10][n+10];     
   for(int i=0;i<=(1<<n);i++)        
    for(int j=0;j<=n;j++)      
          f[i][j]=999999;        
f[1][0]=0;
        for(int i=1;i< (1<<n);i++)    
        for(int j=0; j<n;j++) if(((i>>j)&1)== 1)   
             for(int k = 0 ; k < n; k++) if((((i^(1<<j))>>k)&1)==1)    
                f[i][j] = Math.min(f[i][j],f[i^(1<<j)][k]+a[k][j]);    
    int ans = 9999999;    
    for(int i=1;i<=n;i++)     
       ans = Math.min(f[(1<<n)-1][i]+a[i][0],ans);
        System.out.println(ans); 
   }