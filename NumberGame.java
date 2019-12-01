import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int d=0;
        int e=0;
        int f=0;
        int count=0;
        int max=0;
        boolean find2=false;
        int g=0;
        int temp=1;
        int []b=new int[a];
        for(int i=0;i<a;i++){
            b[i]=in.nextInt();
        }
        for(int j=0;j<a;j++){
            int c=b[j]%5;
            switch (c){
                case 0:{
                    if(b[j]%2==0){
                        d+=b[j];
                    }
                    break;
                }
                case 1:{
                    find2=true;
                    g+=temp*b[j];
                    temp=(-1)*temp;
                    break;

                }
                case 2:{
                    e++;
                    break;

                }
                case 3:{
                    count++;
                    f+=b[j];
                    break;

                }
                case 4:{
                    if(b[j]>max){
                        max=b[j];
                    }
                    break;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.0");
        String  m="N";
        if(count>0){
            m=df.format(f*1.0/count);
        }
        if (d == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(d+" ");
        }
        if (find2){
            System.out.print(g+" ");
        }else {
            System.out.print("N"+" ");
        }        if (e == 0){
            System.out.print("N"+" ");
        }else {
            System.out.print(e+" ");
        }
        System.out.print(m+" ");
        if (max == 0){
            System.out.print("N");
        }else {
            System.out.print(max);
        }

    }
}
