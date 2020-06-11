 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 /** * 关键在于relations[]数组的存取，并不一定使用二维数组啊 */
public class SelectMayor { 
   public static void main(String[] args) { 
       Scanner scn = new Scanner(System.in);    
    int T = scn.nextInt(); // 测试数据组数 
       for (int i = 0; i < T; i++) {   
         int n = scn.nextInt(); // 人数    
        int m = scn.nextInt(); // 关系数  
         boolean isOffical = true;             // 存在镇长，首先至少要有n-1条关系，因为至少要有n-1个人都认识同一个人       
     if (m < n - 1) {            
    System.out.println(0);   
             System.out.println();     
           isOffical = false;         
   }          
   int[] relations = new int[n + 1]; // 存取这n个人对应的认识关系数，别人认识自己的个数-自己认识别人的个数         
   for (int j = 0; j < m; j++) {    
            // out表示自己认识别人     
           int out = scn.nextInt();           
     // in表示别人认识自己         
       int in = scn.nextInt();        
        if (isOffical) {                  
  if (out != in) {                    
    relations[out]--;              
          relations[in]++;        
            }          
      }      
      }        
     if (!isOffical) { // 该组不存在镇长        
        continue;        
    }             // 存储符合条件的镇长        
    List<Integer> list = new ArrayList<Integer>();      
      for (int j = 1; j < relations.length; j++) {      
          if (relations[j] == n - 1) {           
         list.add(j);          
      }        
    }       
      System.out.println(list.size());     
       if (list.size() != 0) {           
     for (int j = 0; j < list.size() - 1; j++) {          
          System.out.print(list.get(j) + " ");    
            }            
    System.out.print(list.get(list.size()-1));  // 最后一个输出没有空格        
    }        
    System.out.println();     
   }       
 scn.close();  
  }
}