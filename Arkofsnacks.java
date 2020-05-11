 
import java.util.ArrayList;
import java.util.Scanner; 
class Solution {   
 public int getMinStep(int n, int m, ArrayList<Integer> arr) {  
      int minIndex1 = 0;    
    int minIndex2 = 1;   
     int minSum;     
   while (arr.size() != m) {     
       minSum = Integer.MAX_VALUE;       
     for (int i = 0, j = i + 1; i < arr.size() - 1 && j < arr.size(); i++, j++) {    
            if (minSum > arr.get(i) + arr.get(j)) { 
                   minSum = arr.get(i) + arr.get(j);   
                 minIndex1 = i;          
          minIndex2 = j;         
       }          
   }        
    arr.set(minIndex1, minSum);     
       arr.remove(minIndex2);      
                }    
    int result = this.getMaxInt(arr, n);   
     return result;    
}     
public int getMaxInt(ArrayList<Integer> arr, int n) {   
     int result = arr.get(0);  
      for (int i = 0; i < arr.size(); i++) {   
         if (result < arr.get(i)) {           
     result = arr.get(i);          
  }     
   }    
    return result;   
 }
} public class Main {   
 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();      
  int m = sc.nextInt();     
   ArrayList<Integer> arr = new ArrayList<>();  
      for (int i = 0; i < n; i++) {  
          arr.add(sc.nextInt());      
  }      
         //完成初始数据采集    
    Solution solution = new Solution();
        int result = solution.getMinStep(n, m, arr);  
      System.out.println(result); 
   }
}