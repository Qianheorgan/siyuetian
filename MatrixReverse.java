
import java.util.*;
public class MatrixReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            long A1=sc.nextLong();
            long A2=sc.nextLong();
            long s;
            if(A1==1&&A2==1){
                s=1;
            }else if(A1==1){
                s=A2-2;
            }else if(A2==1){
                s=A1-2;
            }else{
                s=(A1-2)*(A2-2);
            }
            System.out.println(s);
        }
    }
}