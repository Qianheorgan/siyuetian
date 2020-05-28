 
import java.util.*;
import java.math.*;
public class Cyclenumbercomparison {   
 public static void main(String []args){    
    Scanner in=new Scanner(System.in);  
      String s1=in.next(),s2,a="",b="";    
    int k1=in.nextInt(),k2,i;  
      s2=in.next();k2=in.nextInt();  
      for(i=0;i<k1;i++) a+=s1;     
   for(i=0;i<k2;i++) b+=s2;  
      BigInteger x=new BigInteger(a),y=new BigInteger(b);    
    System.out.printf("%s",x.compareTo(y)>0?"Greater":x.compareTo(y)<0?"Less":"Equal");  
  }
}