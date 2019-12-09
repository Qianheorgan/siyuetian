import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double base=in.nextDouble();
        int exponent=in.nextInt();

        System.out.println( Power(base,exponent));
    }
    public static double Power(double base, int exponent) {
        double a=1.0d;
        int e = exponent > 0 ? exponent : -exponent;
        for(int i=0;i<e;i++){
            a*=base;
        }
        return exponent > 0 ? a:1/a;
    }
}