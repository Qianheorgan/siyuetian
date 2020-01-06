import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(true) {

            System.out.println("*************************");
            System.out.println("******1、验证身份证号码***");
            System.out.println("******2、退出         ***");
            System.out.println("*************************");
            System.out.println("请选择：");

            int b=in.nextInt();
            switch (b) {
                case 1: {
                    try {
                        System.out.println("请输入身份证号码：");
                        in.nextLine();
                        String a=in.nextLine();

                        if(a.length()!=18){
                            throw new Exception();
                        }
                        for(int i=0;i<a.length()-1;i++){
                            if(!Character.isDigit(a.charAt(i))){
                                throw new Exception();
                            }
                        }
                        System.out.println("正确");
                    } catch (Exception c) {
                        System.out.println("身份证号码不正确");
                    }
                    break;
                }
                case 2: {
                    System.exit(0);
                }
                default:{
                    System.out.println("输入错误，请重新选择：");
                }
            }
        }
    }
}


