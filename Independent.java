 
import java.util.Scanner;
 public class Independent {
    public static void main(String[] args) {        
Scanner sc=new Scanner(System.in);   
     int rentPay=sc.nextInt();    
    int appleNum=sc.nextInt();   
     int totalMoney=sc.nextInt();      
  int applePrice=sc.nextInt();           
      if(totalMoney/rentPay<=appleNum)     
       System.out.println(totalMoney/rentPay);   
     else      
      System.out.println(appleNum+(totalMoney-appleNum*rentPay)/(applePrice+rentPay));             
    sc.close();   
 }
}