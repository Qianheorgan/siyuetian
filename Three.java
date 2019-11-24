//尼科彻斯定理
import java.util.*;
public class Three{
    public static void main(String[ ]args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=a*a-(a-1);
        for(int i=0;i<a;i++){
            if(i==a-1){
                System.out.print(b);
                break;
            }
            System.out.print(b+"+");
            b+=2;
        }
    }
}
