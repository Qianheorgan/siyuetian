 
import java.util.*; 
public class Periods {  
  public long getLongest(int n, String s) {        
         ArrayList<Integer> arr=new ArrayList<>();     
   for(int i=n-1; i>0; i--){        
    if(s.charAt(i)==s.charAt(0))        
        arr.add(i);     
   }     
   int sum=0;   
     int[] b=new int[n];      
  for(int i=0; i<arr.size(); i++){      
      for(int j=arr.get(i),k=0; j<n; j++,k++){     
           if(s.charAt(j)==s.charAt(k))                 
   b[j]=(b[j]>arr.get(i))? b[j]:arr.get(i);           
     else                  
  break;       
     }    
    }     
  for(int ele: b)       
     sum+=ele;    
    return sum;   
 }
}