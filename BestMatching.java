 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 public class BestPairing {
//思路---本题等价于A==B?A交B:A交B+1 A==B指A集合与B集合元素除下标外完全相等
//按照这个思路，排序O(nlogn)+遍历O(n)就能判断A==B的真值并能求出A交B的值
//优化--能不能不排序？利用Set先放入集合A再遍历B将已有元素置空，则有A交B=(2n-set.size())/2 【set为空代表相等】
//有个问题，集合中可能会含有重复元素--可用hashmap，结构类似于->map(key,count)
    public static void main(String[] args) {      
  Scanner read=new Scanner(System.in);     
   int n=read.nextInt();        
int[] arrA=new int[n],arrB=new int[n];      
  for(int i=0;i<n;i++)      
      arrA[i]=read.nextInt();      
  for(int i=0;i<n;i++)         
   arrB[i]=read.nextInt();   
     read.close();
//      sortWay(arrA,arrB); 
       mapWay(arrA,arrB);   
 }       
  public static void sortWay(int[] arrA,int[] arrB) {   
     int n=arrA.length;  
      Arrays.sort(arrA);      
  Arrays.sort(arrB);      
  int intersect=0,a=0,b=0;     
   while(a<n&&b<n) {    
        if(arrA[a]==arrB[b]) { 
               ++intersect;        
        ++a;             
   ++b;         
   }else if(arrA[a]>arrB[b])      
          ++b;        
    else ++a;     
   }       
 if(intersect==n)      
      --intersect;      
  else 
++intersect;   
     System.out.println(intersect);    
}   
 public static void mapWay(int[] arrA,int[] arrB) {    
    Map<Integer,Integer> map=new HashMap<>();   
     for(int i : arrA)         
   if(map.containsKey(i))       
         map.put(i,map.get(i)+1);       
     else         
       map.put(i, 1);      
  for(int i : arrB)          
   if(map.containsKey(i)) {   
             int val=map.get(i);   
             if(val==1)              
      map.remove(i);          
      else                 
   map.put(i, val-1);      
      }else              
  map.put(i, -1);   
     if(map.isEmpty())  
          System.out.println(arrA.length-1);      
  else {         
   int intersect=0;      
      for(int i : map.keySet())      
          intersect+=Math.abs(map.get(i));   
         intersect=(2*arrA.length-intersect)/2;   
         System.out.println(intersect+1);   
     } 
   }
}