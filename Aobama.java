import java.util.Scanner;

//输入正方形边长和字符，输出正方形
public class Aobama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String c = sc.next();
        int row = N / 2;
        if (N % 2 != 0) {
            row = N / 2 + 1;
        }
        if (row == 2) {
            for (int i = 0; i < N; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < N; i++) {
                System.out.print(c);
            }        }
            else {
            for (int i = 0; i < N; i++) {
                System.out.print(c);
            }
            System.out.println();
            for (int i = 0; i < row - 2; i++) {
                System.out.print(c);
                for (int j = 0; j < N - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(c);
                System.out.println();
            }
            for (int i = 0; i < N; i++) {
                System.out.print(c);
            }
        }
    }
}
