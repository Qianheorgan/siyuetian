 
import java.util.Scanner;
  
public class Main {   
 public static void main(String[] args){ 
       Scanner sc=new Scanner(System.in);   
      while(sc.hasNext()){           
 int x=sc.nextInt();         
   int y=sc.nextInt();         
   long[][] path=new long[x+1][y+1];        
    int n=sc.nextInt();         
   for(int i=0;i<n;i++){       
         int a=sc.nextInt();      
          int b=sc.nextInt();       
         path[a][b]=-1;        
    }                      
   for(int i=0;i<=x;i++){   
             path[i][0]=1;         
   }           
 for(int j=0;j<=y;j++){       
         path[0][j]=1;    
        }           
 for(int i=1;i<=x;i++){    
            for(int j=1;j<=y;j++){       
             if(path[i][j]==-1){         
               path[i][j]=0;             
       }else{                     
   path[i][j]=path[i][j-1]+path[i-1][j];     
               }         
       }          
  }           
 System.out.println(path[x][y]);     
   }   
 }
}