
import java.util.Scanner;
public class DiglettRun {
    public int countPath(int m, int n, int x, int y, int k) {
        if (!(x>=0 && x<m && y>=0 && y<n))
            // 逃出
            return 1;
        else if (k == 0)
            // 在范围内，但步数已经为0，返回0
                      return 0;
        return countPath(m,n,x+1,y,k-1) + countPath(m,n,x-1,y,k-1) +
                countPath(m,n,x,y+1,k-1) + countPath(m,n,x,y-1,k-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DiglettRun main = new DiglettRun();
        while(in.hasNextInt()) {
            int m = in.nextInt();
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int k = in.nextInt();
            System.out.println(main.countPath(m,n,x,y,k));
        }
    }
}