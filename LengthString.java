import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        if (n<= 0 || n>s.length()){
            System.out.println(-1);
            return;
        }
        for (int i=0,j=n;j<=s.length();i++,j++){
            System.out.print(s.substring(i,j)+" ");
        }
    }
}