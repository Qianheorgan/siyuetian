 
import java.util.Arrays;
import java.util.Scanner;
 public class Patchworktriangle {  
   public static void main(String[] args) {       
 Scanner sc = new Scanner(System.in);   
     int[] arr = new int[3];    
    arr[0] = sc.nextInt();  
      arr[1] = sc.nextInt();   
     arr[2] = sc.nextInt();   
     Arrays.sort(arr); 
       while (arr[2] >= arr[0] + arr[1]) { 
           arr[2]--;        
}       
 System.out.println(arr[0] + arr[1] + arr[2]);   
 }
}