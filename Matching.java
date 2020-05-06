
import java.text.DecimalFormat;
import java.util.Scanner;
public class Matching {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int v=in.nextInt();
        int sum=0;
        double[]a=new double[n];
        double[]b=new double[n];
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextDouble();
            sum+=a[i];
        }
        for (int i = 0; i <n ; i++) {
            b[i]=in.nextDouble();
        }
        double weightMax=b[0]/a[0]*sum;
        //int weightMaxIndex=0;
           for (int i = 1; i < n; i++) {
               double maxV=b[i]/a[i]*sum;
               if(maxV<weightMax){
                   weightMax=maxV;
                   // weightMaxIndex=i;
                          }
           }
           if(weightMax>=v){
               keepFour(v);
           }else{
               keepFour(weightMax);
           }
    }
    public static  void keepFour(double d1){
        DecimalFormat df=new DecimalFormat("#0.0000");
        System.out.println(df.format(d1));
    }
}