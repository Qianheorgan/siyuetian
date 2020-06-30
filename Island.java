 
import java.util.Scanner;
import java.util.Arrays;
 public class Island {  
  public static void main( String[] args ) {  
      Scanner sc = new Scanner( System.in );    
    while( sc.hasNext() ) {         
   int m = sc.nextInt();        
    int n = sc.nextInt();       
     int[][] land = new int[m][n];   
         for( int i = 0; i < m; i ++ )      
          for( int j = 0; j < n; j ++ )      
              land[i][j] = -2;       
     int res = 0;        
    for( int k = sc.nextInt(); k > 0; k -- ) {     
           int x = sc.nextInt();             
   int y = sc.nextInt();          
      if( x<m && x>=0 && y<n && y>=0 && land[x][y] == -2 ) {        
            land[x][y] = -1;                
    res ++;                 
   if( x > 0 && land[x-1][y] != -2 &&           
             merge( land, x, y, x-1, y ) ) res --;      
              if( x < m-1 && land[x+1][y] != -2 &&    
                    merge( land, x, y, x+1, y ) ) res --;   
                 if( y > 0 && land[x][y-1] != -2 &&   
                     merge( land, x, y, x, y-1 ) ) res --;
                    if( y < n-1 && land[x][y+1] != -2 &&     
                   merge( land, x, y, x, y+1 ) ) res --;      
          }            
    if( k != 1 ) System.out.print( res + " " );  
              else System.out.println( res );     
       }       
 }      
  sc.close();   
 }   
 private static boolean merge( int[][] land, int x1, int y1, int x2, int y2 ) {  
      int n = land[0].length;     
   while( land[x2][y2] != -1 ) {    
        int tmp = land[x2][y2];           
 x2 = tmp / n; y2 = tmp % n;     
   }      
  if( x1 == x2 && y1 == y2 )
 return false;   
     else { land[x2][y2] = x1 * n + y1; return true; 
} 
   }
} 