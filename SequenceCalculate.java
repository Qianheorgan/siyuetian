 
import java.util.Scanner;
 public class Main { 
 //就是将k转成2进制，比如k=6，n=4,k的2进制为110，
然后以n进制输出来。即1*4^2+1*4^1+0*4^0 
   public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);    
    //进制基数     
   int n = scanner.nextInt();     
   //第k个数       
 int k = scanner.nextInt();       
 //转化为二进制字符串       
 String s = Integer.toBinaryString(k);    
    int sum=0;      
  for (int i = 0,len=s.length(); i <len; i++) {        
    int bit=s.charAt(i)=='1'?1:0;      
      sum+=bit*Math.pow(n,len-i-1);  
      }       
 System.out.println(sum);   
 }
}