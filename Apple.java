import java.util.Scanner;

public class Apple {
    public static int Apple1(int n){
        if(n<6){
            return -1;
        }
        if(n%8==0 ){
            return n/8;
        }
        if(n%6==0){
            return n/6;
        }



         for(int i=0;i<100;i++){
                for(int j=0;j<100;j++){
                    if(i*6+j*8==n){
                        return i+j;
                    }
                    if(i*8+i*6==n){
                        return i+j;
                    }
                }
            }


return -1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println( Apple1(n));
    }
}
