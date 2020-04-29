 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*; 
public class Main {
    public static void main(String []args) {       
 try {           
 InputStreamReader is_reader = new InputStreamReader(System.in, "UTF-8");      
      String str = new BufferedReader(is_reader).readLine();      
      str = str.replaceAll("\\$", "\\^");           
 String result = str.replaceAll("[^a-z^A-Z^\\[^\\^^\\]^\\_^\\']", "");   
         System.out.println(result);        
} catch (IOException e) {            
e.printStackTrace();     
   }
    }
}