//百万富翁问题
public class MilionRich {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        for(int i=0;i<30;i++){
            b+=a;
            a=a*2;
        }
        System.out.println(30*10);
        System.out.println(b);
    }
}
