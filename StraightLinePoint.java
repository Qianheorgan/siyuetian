 
import java.util.*; 
public class StraightLinePoint { 
   static class Point {    
    int x;    
    int y;
        int z;      
  Point() {x = 0; y = 0; z = 0;}    
    Point(int a, int b, int c) {       
    x = a;    
        y = b;
            z = c; 
       }  
  }    
public static void main(String[] args) {      
  Scanner in = new Scanner(System.in);   
     int n = in.nextInt();    
    Point[] points = new Point[n];     
   for (int i = 0; i < n; i++)         
    points[i] = new Point(in.nextInt(), in.nextInt(), in.nextInt());  
      System.out.println(maxPoints(points)); 
   }  
   private static int maxPoints(Point[] points) {      
  int n = points.length;    
    if (n == 0)      
      return 0;       
 if (n <= 2)          
  return n;    
    int result = 0, overlap = 0, count = 0;  
       HashMap<Integer, HashMap<Integer, HashMap<Integer, Integer>>> map = new HashMap<>();    
    for (int i = 0; i < n; i++) {    
        for (int j = i+1; j < n; j++) {   
             int dx = points[i].x - points[j].x;    
            int dy = points[i].y - points[j].y;  
              int dz = points[i].z - points[j].z;
                if (dx == 0 && dy == 0 && dz == 0) {         
           overlap++;                
    continue;         
       }         
       int gcd = gcd(dx, dy, dz);       
         if (gcd != 0) {            
        dx /= gcd;            
        dy /= gcd;             
       dz /= gcd;             
   }           
      if (map.containsKey(dx)) {        
            if (map.get(dx).containsKey(dy)) {   
                     if (map.get(dx).get(dy).containsKey(dz)) {     
                       map.get(dx).get(dy).put(dz, map.get(dx).get(dy).get(dz) + 1);             
           }                   
     else                  
          map.get(dx).get(dy).put(dz, 1);      
              }              
      else {               
         HashMap<Integer, Integer> map1 = new HashMap<>();               
         map1.put(dz, 1);        
                map.get(dx).put(dy, map1);      
              }               
 }           
     else {     
               HashMap<Integer, Integer> map1 = new HashMap<>();       
             HashMap<Integer, HashMap<Integer, Integer>> map2 = new HashMap<>();     
               map1.put(dz, 1);         
           map2.put(dy, map1);       
             map.put(dx, map2);      
          }               
 count = Math.max(count, map.get(dx).get(dy).get(dz));   
         }      
      result = Math.max(result, count+overlap+1);     
       map.clear();   
         overlap = 0; 
           count = 0;      
  }      
  return result; 
   }  
   private static int gcd(int a, int b) {   
     if (b == 0)     
       return a;      
  else           
 return gcd(b, a % b);  
  }     
private static int gcd(int a, int b, int c) {  
      return gcd(gcd(a, b), c);  
  }
}