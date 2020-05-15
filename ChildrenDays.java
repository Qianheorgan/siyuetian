 
import java.util.Arrays;
import java.util.Scanner; 
public class Main {  
  public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);  
      int n = sc.nextInt();// n个学生       
 int[] h = new int[n];// 学生     
   for (int i = 0; i < h.length; i++) {     
       h[i] = sc.nextInt();    
    }   
      int m = sc.nextInt();// m个巧克力    
    int[] w = new int[m];// 巧克力     
   for (int i = 0; i < w.length; i++) {     
       w[i] = sc.nextInt();      
  }        
 Arrays.sort(w);// 巧克力排序       
 Arrays.sort(h);// 学生排序    
     int stuStart = 0;      
  int count = 0;     
   for (int i = 0; i < w.length; i++) {        
    if (w[i] < h[stuStart]) {// 如果最小的巧克力比最小的学生要的小,那么跳出去下一个巧克力           
     continue;          
  } else {// 如果最小的巧克力比最小的学生要的大      
          count++;// 那就把这个糖果给他,count加1   
             stuStart++;// 给他后,把最小的学生加一个      
          if (stuStart == n) {// 如果最后一个学生都有糖了,就不找了,break掉     
               break;           
     }        
    }       
 }     
   System.out.println(count);
    }
}