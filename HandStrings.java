 
import java.util.*;
    public class HandStrings{  
  public static void main(String[] args){      
  Scanner sc = new Scanner(System.in);    
    int n = sc.nextInt();     
   int m = sc.nextInt();     
   int c = sc.nextInt();      
  int sum = 0;   
     int[] num = new int[c+1];    
    int[] early = new int[c+1];     
   Set<Integer> set = new HashSet<>();    
    for(int i1=1;i1<=n;i1++){      
      int t = sc.nextInt();    
        if(t==0) continue;   
         for(int i=0;i<t;i++){      
          int tmp = sc.nextInt();     
           if(early[tmp]==0) early[tmp] = i1;  
              if(num[tmp]>0&&i1-num[tmp]+1<=m) set.add(tmp);         
       if(i1+m-1>n&&early[tmp]<=(i1+m-1)%n) set.add(tmp);    
            num[tmp]=i1;     
        }   
    }     
   System.out.println(set.size());   
     sc.close();   
 }
}