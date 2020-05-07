 
import java.util.Scanner;
public class Main {   
 public static void main(String[] args) {   
     Scanner scanner = new Scanner(System.in);  
      long time = scanner.nextLong();  
      long value = 3;     
   while(time - value > 0){    
        time -= (value);        
    value <<= 1;      
  } 
       value -= time - 1; 
       System.out.println(value);   
 }
}