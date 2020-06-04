import java.util.*;

public class Mineralwater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int x = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(getMin(x, a, b));
        }
    }
    public static int getMin(int x, int a, int b){
        if(3*a <= b){
            if(x%500 == 0)
                return x/500*a;
            else
                return (x/500 + 1)*a;
        }else{
            if(x%1500 == 0)
                return x/1500*b;
            else{
                int rest = x - (x/1500)*1500;
                int aNum = 0;
                if(500 >= rest)
                    aNum = 1;
                else if(rest <= 1000)
                    aNum = 2;
                else aNum = 3;
                return Math.min(x/1500*b+b, aNum*a + x/1500*b);
            }
        }
    }
}
