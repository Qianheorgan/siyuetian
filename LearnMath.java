 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 public class Main {     
static ArrayList<Integer> record =new ArrayList<>();     
    public static void main(String[] args) {    
    Scanner scanner = new Scanner(System.in);  
      int n = scanner.nextInt();     
   recordPrimes(n);     
   int count=0;              
   //对于有序数组的双指针的方法   
     int i=0;       
 int j=record.size()-1;  
     while (i<=j){   
         int sum=record.get(i)+record.get(j);   
         if (sum==n){         
       count++; i++; j--;         
   }      
      else if (sum<n) i++;   
        else j--;   
     }      
  System.out.println(count);   
 }    
 //比较快的判断是否为素数的方法  
  static void recordPrimes(int n) { 
       boolean[] isPrim = new boolean[n];   
     Arrays.fill(isPrim, true);      
  for (int i = 2; i * i < n; i++)       
     if (isPrim[i])            
    for (int j = i * i; j < n; j += i)      
              isPrim[j] = false;    
    for (int i = 2; i < n; i++)         
   if (isPrim[i]) record.add(i);   
 }
}