import java.io.*;

public class First {
    public static void main(String[] args) throws FileNotFoundException {
        String number = new String("0123456789");// 数字提取的总库
        String big = new String("ABCDEFGHIGKLMNOPQRSTUVWXYZ");// 大写字母提取的库
        String smart = new String("abcdefghigklmnopqrstuvwxyz_");//小写字母和下划线
        String add = smart.concat(number);//字符串的拼接
        String all = add.concat(big);//密码的总库
        StringBuilder password = new StringBuilder("");//变量的初始化操作
        File file = new File("D:\\Java实验\\password");//写入文件的路径
        PrintWriter input = new PrintWriter(file);//为文件创建一个PrintWhite的对象
        for (int j = 0; j < 100; j++) {
            password = new StringBuilder("");
            for (int i = 0; i < 12; i++) {//密码创建
                if (i == 0 || i == 2 || i == 4) {//第1，3，5位的密码
                    int a = (int) (Math.random() * 10);//产生随机整型数，确定数组的位置
                    // System.out.println(a);
                    password.append(number.charAt(a));//利用数组的位置将其加入密码
                    // System.out.println(password);
                } else if (i == 1 || i == 3 || i == 5) {//第2，4，6位的密码
                    int a = (int) (Math.random() * 26);
                    //System.out.println(a);
                    password.append(big.charAt(a));
                    // System.out.println(password);
                } else {//其他位的密码
                    int a = (int) (Math.random() * 63);
                    password.append(all.charAt(a));
                   // System.out.println(password);
                }
            }
            input.print(password);//将密码写入到文件中
            input.print("\r\n");//密码进行换行操作
        }
        input.close();//关闭写入的通道
    }
}

