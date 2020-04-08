import java.util.Scanner;

public class Bad {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int f=in.nextInt();
        int count=1;
        for (int i=0;i<m;i++){
            int a=in.nextInt();
            for(int j=0;j<a;j++ ){
                int b=in.nextInt();
                if(b==f){
                    count+=a-1;
                }
            }
        }
        System.out.println(count);
    }
}
