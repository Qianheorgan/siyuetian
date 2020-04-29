 
import java.util.Random;
public class Main{  
  public static void main(String [] args){    
int [] a=new int[10];   
 Random r=new Random();  
  for(int i=0;i<10;i++){     
   a[i]=r.nextInt(20);   
 }
    for(int i=0;i<9;i++){    
    for(int j=0;j<9-i;j++){     
       if(a[j]<a[j+1]){      
          int tmp=a[j];      
          a[j]=a[j+1];      
          a[j+1]=tmp;      
  }
    }
}for(int num:a){   
 System.out.println(num);
}
    }
}