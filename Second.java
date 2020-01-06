import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        password();
        while(true) {
            System.out.println("*************************");
            System.out.println("******1、生成下一个密码****");
            System.out.println("******2、退出         ****");
            System.out.println("*************************");
            System.out.println("请选择：");
            Scanner in = new Scanner(System.in);
            int s=in.nextInt();
            switch (s){
                case 1:{
                    password();
                    break;
                }
                case 2:{
                    System.exit(0);

                }
                default:{
                    System.out.println("选择错误，请重新选择：");
                    break;
                }
            }
        }
    }
    public  static void password(){
        int num = (int) (Math.random() * 8 + 8);
        int a =-1;
        char[] sun= new char[num];
        for (int i=0;i<num;i++){
           sun[i]='%';
        }
        String number = "0123456789";
        String small= "abcdefghigklmnopqrstuvwxyz";
        String big = "ABCDEFGHIGKLMNOPQRSTUVWXYZ";
        String e = "_-@";
        String all="12_-@34567890abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ";
        sun[++a]=number.charAt((int)(Math.random()*10));
        sun[++a]=small.charAt((int)(Math.random()*26));
        sun[++a]=big.charAt((int)(Math.random()*26));
        sun[++a]=e.charAt((int)(Math.random()*3));
        a+=1;
        for (int i=a;i<num;i++){
            sun[i]=all.charAt((int)(Math.random()*65));
        }
        System.out.println(sun);
    }
}
