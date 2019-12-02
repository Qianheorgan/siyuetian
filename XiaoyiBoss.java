import java.util.Scanner;
//小易的升级之路
public class XiaoyiBoss {
    public static void z(int b,int[]c){
        for(int i=0;i<c.length;i++){
            if(c[i]<=b){
                b+=c[i];
            }
            else {
                int d = b;
                int e = c[i];
                while (d % e != 0) {
                    int a = d % e;
                    d = e;
                    e = a;
                }
                b += e;
            }
        }
        System.out.println(b);
    }
    public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                while(in.hasNext()){
                    int a=in.nextInt();
                    int b=in.nextInt();
                    int[]c=new int[a];
                    for(int i=0;i<a;i++){
                        c[i]=in.nextInt();
                    }
                    z(b,c);
                }
    }
}
