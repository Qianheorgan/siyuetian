  import java.util.HashSet;
import java.util.Scanner;
 public class Main {    
public static void main(String[] args) {     
   Scanner scanner = new Scanner(System.in);   
     String string = scanner.nextLine(); 
      // 用hashSet记录字符串中有几种字符 
       HashSet<String> hashSet = new HashSet<>();    
    for (int i = 0; i < string.length(); i++) {     
       hashSet.add(string.substring(i, i + 1)); 
           // 如果一旦有两种以上的字符就输出0   
         if (hashSet.size() > 2) {         
       System.out.println(0);           
     return;          
  }       
 }  
      // 有两种字符就输出2，有一种字符就输出1
        System.out.println(hashSet.size()); 
   }
}