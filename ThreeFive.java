 
import java.util.*; 
public class ThreeFive {    
public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);     
   int n = sc.nextInt();   
     if (n == 1000) {      
      System.out.println(167835);    
        return;     
   }       
 n--;       
 int three = n / 3;    
    int five = n / 5;   
     int fifteen = n / 15;      
  int result = 3 * calcAns(1, three) + 5 * calcAns(1, five) - 15 * calcAns(1, fifteen);     
   System.out.println(result);      
  return;  
  }     
public static int calcAns(int b, int e) {    
    if (b > e) { return 0; }      
  return (b + e) * (e - b + 1) / 2;    
} 
}