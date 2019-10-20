import java.util.*;
public class F {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();//接受键盘输入
            int a = 0;
            int b = 1;//从第三个数字开始等于前两个数相加
            int temp=0;
            while (b < x) {//输入的值大于前面数
              temp= a + b;
                a = b;
              b = temp;

            }

            System.out.println(Math.min(x - a, b - x));
        }
    }



