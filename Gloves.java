 

import java.util.*; 
public class Gloves {  
  public int findMinimum(int n, int[] left, int[] right) {   
     int sum = 0;    
    List<Integer> leftList = new ArrayList<Integer>();   
     List<Integer> rightList = new ArrayList<Integer>();      
  for (int i = 0; i < n; i++) {      
      if ((left[i] == 0 && right[i] != 0) || (left[i] != 0 && right[i] == 0)) {         
       sum += left[i] + right[i];           
    } else if (left[i] != 0 && right[i] != 0){            
    leftList.add(left[i]);            
    rightList.add(right[i]);        
    } 
       }        Collections.sort(leftList);      
  Collections.sort(rightList);      
  int sum1 = 0, sum2 = 0;   
     for (int i = leftList.size() - 1; i > 0; i--) {    
        sum1 += leftList.get(i);       
 } 
       for (int i = rightList.size() - 1; i > 0; i--) {   
         sum2 += rightList.get(i);    
    }       
 return Math.min(sum1, sum2) + 2 + sum;   
 }
}