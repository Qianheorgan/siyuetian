 
import java.util.Scanner; 
public class Kangarooriver
 {   
    public static void main(String[] args) {     
        // TODO Auto-generated method stub        
        Scanner scan = new Scanner(System.in);  
        int n = scan.nextInt();        
        int a[] = new int[n];       
        for (int i = 0; i < n; i ++) {     
            a[i] = scan.nextInt();        
        }       
        int Fmin[] = new int[n + 1];     
        Fmin[0] = 0;        
        for (int i = 1; i < n + 1; i ++) {      
            Fmin[i] = 10000;       
            if (i != n && a[i] == 0)         
                continue;     
            for (int j = 0; j < i; j ++) {    
                if (a[j] != 0 && a[j] >= i - j && Fmin[j] < Fmin[i] - 1) { 
                    Fmin[i] = Fmin[j] + 1;      
                }          
            }     
        }        
        if (Fmin[n] == 10000)      
            System.out.println(-1);   
        else             
            System.out.println(Fmin[n]);  
    }  
}