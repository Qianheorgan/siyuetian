 
import java.util.Scanner; 
public class Filename {     
    //文件扩展名filename   
 public static void main(String[] args) {      
           Scanner in = new Scanner(System.in); 
       String filepath = in.next();        
int pos = filepath.lastIndexOf(".");   
     if(pos == -1 || filepath.charAt(pos+1) == '/'){     
       System.out.println("NULL");   
         return ; 
       }      
  System.out.println(filepath.substring(pos+1));  
  }   
  }