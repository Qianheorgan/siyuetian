 
import java.util.*;  
 public class Main {  
    public static void main(String[] args){     
    Scanner sc= new Scanner(System.in);     
    int m=sc.nextInt();        
 int n=sc.nextInt();       
  int [] array1=new int [n];      
   for (int i = 0; i < m; i++)        
      array1[sc.nextInt()%n]++;     
    int sum=array1[0]>0?1:0;      
   for (int i = 1,j=n-1; i<=j; i++,j--)     
             sum+=(i==j)?(array1[i]>=1?1:0):Math.max(array1[i], array1[j]);         System.out.println(sum);   
   }      
    } 